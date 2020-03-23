package com.apress.prospring5.ch2.decoupled;

import java.util.Properties;

//어플리케이션 실행 도중 속성 파일에서
//구현 클래스 이름을 읽고 인스턴스로 만드는 클래스
public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    /*
    Properties:
    속성
    * */
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    //생성자
    //renderer, provider 구현
    private MessageSupportFactory(){
        //Properties 인스턴스 생성
        props = new Properties();

        try {
            //msf.property 파일 읽어오기
            //stream이란? 입출력을 해주는 프로그램인 듯
            props.load(this.getClass()
                    .getResourceAsStream("/msf.properties"));
            //msf.properties에 있는 값들 가져오기
            //참고로 properties에 있는 값들은 String 값이다
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

/*
            Class 는 어플리케이션이 실행하는중에
            인스턴스를 나타낸다
            forName({클래스풀네임}): {클래스풀네임} 이라는 클래스를
            나타내준다
            newInstance: 인스턴스를 만들어준다
*/
            renderer = (MessageRenderer) Class
                    .forName(rendererClass).newInstance();
            provider = (MessageProvider) Class
                    .forName(providerClass).newInstance();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //static인 instance 칸에 정의해줌
    //밖에서 MessageSupportFactory를 static으로 부를 수 있음
    static {
        instance = new MessageSupportFactory();
    }

    //instance get
    public static MessageSupportFactory getInstance() {
        return instance;
    }

    //get MessageRenderer
    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    //get MessageProvider
    public MessageProvider getMessageProvider() {
        return provider;
    }
}
