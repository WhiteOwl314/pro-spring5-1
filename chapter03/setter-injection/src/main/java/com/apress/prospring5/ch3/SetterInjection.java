package com.apress.prospring5.ch3;

import com.sun.tools.classfile.Dependency;

public class SetterInjection {
    private Dependency dependency;

    private void setDependency(Dependency dependency){
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}