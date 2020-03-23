package com.apress.prospring5.ch2.decoupled;

//MessageProvider의 구현체
public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World!!";
    }
}
