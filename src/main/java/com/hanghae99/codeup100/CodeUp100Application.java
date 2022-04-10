package com.hanghae99.codeup100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CodeUp100Application {

    public static void main(String[] args) {

        // Scanner 클래스 : 사용자에게 입력 장치로 입력을 받아 그 값을 변수에 저장하는 역할
        // 즉, 사용자가 입력한 내용을 콘솔창에 바로 출력해주는 기능..?
        Scanner sc = new Scanner(System.in);

        // 1001 - Hello 출력
        System.out.println("Hello");

        // 1002 - Hello World 출력
        System.out.println("Hello World");

        // 1003 - Hello World 두 줄로 출력
        System.out.println("Hello");
        System.out.println("World");
        // 또는 \n 사용해서 줄바꿈
        System.out.println("Hello \nWorld");

        // 1004 - 'Hello' 출력
        System.out.println("'Hello'");

        // 1005 - "Hello" 출력
        // "" 문자를 출력하기 위해서는 \" 사용해서 출력해야한다.
        System.out.println("\"Hello\"");

        // 1006 - 특수문자 출력
        System.out.println("\"!@#$%^&*()'");

        // 1007 - 파일경로 출력
        // 문자 \를 출력하기 위해서는 \\로 출력해야한다.
        System.out.println("\"C:\\Download\\'hello'.py");

        // 1008 - 유니코드로 특수문자 표현
        // 유니코드를 출력하기 위해 를 앞에 붙여 출력해야한다.
        System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");


    }

}
