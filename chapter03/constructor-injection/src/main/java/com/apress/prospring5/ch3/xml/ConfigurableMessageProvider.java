package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch2.decoupled.MessageProvider;

//MessageProvider 구현체
public class ConfigurableMessageProvider implements MessageProvider {

    //전달할 메세지 칸
    private String messgage;

    //생성자, 생성할때 메세지도 받는다
    public ConfigurableMessageProvider(String messgage){
        this.messgage = messgage;
    }

    //getMessage -> 메세지를 반환
    @Override
    public String getMessage() {
        return messgage;
    }
}