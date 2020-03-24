package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String[] args){
        //xml 기반 ApplicationContext 정의
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //xml 지정
        ctx.load("classpath:spring/app-context-xml.xml");
        //context 새로고침
        ctx.refresh();
        //context에서 bean 가져오기
        MessageRenderer messageRenderer = ctx.getBean(
                "renderer",
                MessageRenderer.class);
        messageRenderer.render();
        //context 닫기
        ctx.close();
    }
}
