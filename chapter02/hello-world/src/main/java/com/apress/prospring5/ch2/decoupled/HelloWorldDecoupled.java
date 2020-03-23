package com.apress.prospring5.ch2.decoupled;

public class HelloWorldDecoupled {

    public static void main(String[] args){
        //구현체를 인스턴스를 만들때 붙여주는 건가봄
        //구현체가 아닌 인터페이스에 있는것만 사용하기 위함
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        //mr에다가 mp를 Provider로 세팅하기
        mr.setMessageProvider(mp);
        //mr에게 렌더링하라고 명령
        mr.render();
    }
}
