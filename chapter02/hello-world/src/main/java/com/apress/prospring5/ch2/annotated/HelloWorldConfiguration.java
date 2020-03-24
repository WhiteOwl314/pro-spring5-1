package com.apress.prospring5.ch2.annotated;

import com.apress.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    // <bean id = "provider" class="..."/> 구성과 동등함
    @Bean
    public MessageProvider provider(){
        //HelloWorldMessageProvider 반환
        return new HelloWorldMessageProvider();
    }

    // <bean id = "renderer" class=".."/> 과 동등
    @Bean
    public MessageRenderer renderer(){
        //renderer 지정
        MessageRenderer renderer = new StandardOutMessageRenderer();
        //renderer에 provider 세팅
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
