package com.apress.prospring5.ch3.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@ImportResource 를 사용해서 xml 을 사용할 수 있다
//@ImportResource(locations = {"classpath:spring/app-context-xml.xml"})
@ComponentScan(basePackages = {"com.apress.prospring5.ch3.annotated"})
@Configuration
public class HelloWorldConfiguration {
}
