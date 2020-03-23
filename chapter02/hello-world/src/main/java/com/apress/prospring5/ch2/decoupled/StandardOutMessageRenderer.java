package com.apress.prospring5.ch2.decoupled;

//MessageRenderer 의 구현체
public class StandardOutMessageRenderer implements MessageRenderer{
    //MessageProvider 칸을 만듦
    private MessageProvider messageProvider;

    @Override
    public void render() {

        //.class.getName() 은 그 클래스의 경로와 이름을 반환해준다
        if(messageProvider == null){
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName()
            );
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
