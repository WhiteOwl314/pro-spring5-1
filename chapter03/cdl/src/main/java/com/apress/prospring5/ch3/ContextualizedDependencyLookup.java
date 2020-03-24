package com.apress.prospring5.ch3;


import com.sun.tools.classfile.Dependency;

public class ContextualizedDependencyLookup implements ManagedComponent{
    private Dependency dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (Dependency) container.getDependency("myDemendency");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
