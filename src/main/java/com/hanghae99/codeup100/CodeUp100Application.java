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

        // 22.04.11 ===================================================================================
        // 1001 - Hello 출력
//        System.out.println("Hello");

        // 1002 - Hello World 출력
//        System.out.println("Hello World");

        // 1003 - Hello World 두 줄로 출력
//        System.out.println("Hello");
//        System.out.println("World");
        // 또는 \n 사용해서 줄바꿈
//        System.out.println("Hello \nWorld");

        // 1004 - 'Hello' 출력
//        System.out.println("'Hello'");

        // 1005 - "Hello" 출력
        // "" 문자를 출력하기 위해서는 \" 사용해서 출력해야한다.
//        System.out.println("\"Hello\"");

        // 1006 - 특수문자 출력
//        System.out.println("\"!@#$%^&*()'");

        // 1007 - 파일경로 출력
        // 문자 \를 출력하기 위해서는 \\로 출력해야한다.
//        System.out.println("\"C:\\Download\\'hello'.py");

        // 1008 - 유니코드로 특수문자 표현
        // 유니코드를 출력하기 위해 를 앞에 붙여 출력해야한다.
//        System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");


        // 1010 - 정수값 출력
        // 입력받은 값을 scan에 저장 > nextInt()를 사용하여 정수값 받기
//        int n = sc.nextInt();
//        System.out.println(n);

        // 1011 - 문자형 출력 (문자열 아님!!)
        // Scanner 사용 시 next 관련 함수에서는 문자형에 대한 값을 입력받아 저장해주는 함수가 없다.
        // 그래서 next()를 통해 받은 값을 String에서 charAt을 통해 char값을 저장
        // charAt() : String으로 저장된 '문자열' 중에서 한 글자만 선택해서 char 타입으로 변환해주는 함수
//        char ch = sc.next().charAt(0);
//        System.out.println(ch);

        // 1012 - 실수형 출력
        // printf(): 변수의 값을 여러가지 형식으로 변환하여 출력할 수 있는 지시자 (형식화 된 출력)
//        float f = sc.nextFloat();
//        System.out.printf("%.6f",f);
        // 또는 기본 println() 출력문 사용
        // String.format() : 문자열의 형식을 설정하는 메서드 > %f : 실수형 형식
//        float f2 = sc.nextFloat();
//        String str = String.format("%.6f",f2);
//        System.out.println(str);

        // 1013 - 정수형 2개 출력
//        int a = sc.nextInt(),b = sc.nextInt();
//        System.out.println(a+","+b);

        //22.04.12=====================================================================================

        // 1014 - 문자 2개 입력받아 순서 바꿔 출력
        char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(1);
        System.out.println(ch2 +", "+ ch1);

        // 1015 - 실수 입력받아 둘째 자리까지 출력
        // 다시 float값으로 바꿔주려면 Float.parseFloat() 메소드로 변경 가능
        String result;
        float f = sc.nextFloat();
        result = String.format("%.2f",f);
        System.out.println(result);

        // 1017 - 정수 1개 입력받아 3번 출력하기
        int i = sc.nextInt();
        System.out.println(i+", "+i+", "+i);

        // 1018 - 시간 입력받아 그대로 출력하기
        // next(): 사이띄기, tab키, enter키를 구분문자로 분리해서 분리된 자료만 읽어간다.
        String time = sc.next();
        System.out.printf("%s",time);
        // 또는 nextLine() 메소드 사용
        // nextLine(): 한 줄 단위로 입력한다.
        sc.nextLine(); // 없으면 아래 구문이 실행없이 종료되버림... = 입력버퍼를 비워주는 역할을 한다.
        // 입력버퍼: 다른 장치에서 데이터를 수신할 때 일어나는 시간의 차이나 데이터의 흐름 속도의 차이를 보상하기 위해서 사용하는 일시적인 저장 장치.
        // -> 전에 저장된 데이터가 입력 버퍼에 남아있어서 별도의 입력을 안했는데도 넘어가버리는 것.
        String time2 = sc.nextLine();
        System.out.println(time2);
    }
}
