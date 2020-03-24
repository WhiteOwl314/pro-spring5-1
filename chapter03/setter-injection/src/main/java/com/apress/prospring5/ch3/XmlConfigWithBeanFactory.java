package com.apress.prospring5.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public static void main(String[] args){
        //BeanFactory 정의 , 초기화
        DefaultListableBeanFactory factory =
                new DefaultListableBeanFactory();
        //Xml 리더기 정의 , 초기화, 세팅
        XmlBeanDefinitionReader rdr =
                new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(
                new ClassPathResource(
                        "spring/xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle) factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
