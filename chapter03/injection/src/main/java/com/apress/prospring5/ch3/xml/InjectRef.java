package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch3.Oracle;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRef {

    private Oracle oracle;

    public void setOracle(Oracle oracle){
        this.oracle = oracle;
    }

    public static void main(String[] args){
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
    }
}
