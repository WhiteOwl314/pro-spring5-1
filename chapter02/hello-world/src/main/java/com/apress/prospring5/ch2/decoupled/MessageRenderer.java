package com.apress.prospring5.ch2.decoupled;

public interface MessageRenderer {
    //메세지를 띄워준다
    void render();
    //메세지를 제공해주는 Provider를 세팅한다
    void setMessageProvider(MessageProvider provider);
    //세팅되어있는 MessageProvider를 반환한다
    MessageProvider getMessageProvider();
}
