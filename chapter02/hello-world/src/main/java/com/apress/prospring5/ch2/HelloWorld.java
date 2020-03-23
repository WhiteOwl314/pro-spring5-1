package com.apress.prospring5.ch2;

import com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer;

public class HelloWorld {
    //main 의 이름을 바꾸면 실행이 안되는 것을 알 수 있다.
    //실행파일의 이름은 main으로 고정되어 있는 것을 볼 수 있다.
    //string[] args 는 String 배열이며 main함수 내용을 의미한다
    //즉 함수 안의 내용을 실행한다는 함수이다
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
