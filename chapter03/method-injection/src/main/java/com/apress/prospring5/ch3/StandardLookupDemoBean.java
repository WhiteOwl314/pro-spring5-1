package com.apress.prospring5.ch3;

public class StandardLookupDemoBean implements DemoBean{
    private Singer mySinger;

    public void setMySinger(Singer singer){
        this.mySinger = singer;
    }

    @Override
    public Singer getMySinger() {
        return mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
