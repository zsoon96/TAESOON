package com.hanghae99.codeup100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.soap.SAAJResult;
import java.util.Scanner;
import java.util.StringTokenizer;

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
//        char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(1);
//        System.out.println(ch2 +", "+ ch1);

        // 1015 - 실수 입력받아 둘째 자리까지 출력
        // 다시 float값으로 바꿔주려면 Float.parseFloat() 메소드로 변경 가능
//        String result;
//        float f = sc.nextFloat();
//        result = String.format("%.2f",f);
//        System.out.println(result);

        // 1017 - 정수 1개 입력받아 3번 출력하기
//        int i = sc.nextInt();
//        System.out.println(i+", "+i+", "+i);

        // 1018 - 시간 입력받아 그대로 출력하기
        // next(): 사이띄기, tab키, enter키를 구분문자로 분리해서 분리된 자료만 읽어간다.
//        String time = sc.next();
//        System.out.printf("%s",time);
        // 또는 nextLine() 메소드 사용
        // nextLine(): 한 줄 단위로 입력한다.
//        sc.nextLine(); // 없으면 아래 구문이 실행없이 종료되버림... = 입력버퍼를 비워주는 역할을 한다.
        // 입력버퍼: 다른 장치에서 데이터를 수신할 때 일어나는 시간의 차이나 데이터의 흐름 속도의 차이를 보상하기 위해서 사용하는 일시적인 저장 장치.
        // -> 전에 저장된 데이터가 입력 버퍼에 남아있어서 별도의 입력을 안했는데도 넘어가버리는 것.
//        String time2 = sc.nextLine();
//        System.out.println(time2);

        // 1019 -연월일 입력받아 순서 바꿔 출력하기
        // 먼저 입력된 문자열을 .기준으로 자른 후, 문자열 리스트에 넣어주기
        // split을 사용할 땐 앞에 백슬래시 2개 붙여줘야 함
//        String[] ymd = sc.nextLine().split("\\.");
        // integer.parseInt로 정수형으로 변환 후 저장
//        int y = Integer.parseInt(ymd[0]);
//        int m = Integer.parseInt(ymd[1]);
//        int d = Integer.parseInt(ymd[2]);
        // 출력값이 dd-mm-yyyy 되어야하는데, 한 자리 수로 입력할 경우 빈공간에는 0을 넣어서 출력하기.
//        System.out.printf(String.format("%02d.%02d.%04d",d,m,y));

        // 또는 문자열로 출력하는 경우
//        String ymd2 = sc.nextLine();
        // StringTokenizer: 구분자를 이용해 문자열 쪼개주기 > (파싱할 문자열, 구분자)를 인자로 받는다.
//        StringTokenizer split = new StringTokenizer(ymd2,".");
        // 정수형의 리스트 생성
//        int [] ymd3 = new int[3];
        // index 값 초기화
//        int i = 0;
        // split에 hasMoreTokens메서드를 통해 StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인
        // 참이면 go, 거짓이면 stop
//        while (split.hasMoreTokens()) {
            // 만들어준 정수형 리스트에 해당 문자열을 정수형으로 변환하여 담아줄건데,
            // nextToken() 메서드를 통해 다음 토큰을 불러와 리스트에 i만큼씩 담아주기
//            ymd3[i] = Integer.parseInt(split.nextToken());
            // 1씩 증가
//            i += 1;

        // String.format을 사용해 문자열 형식을 정수 형식으로 바꿔서 각각 변수에 담아주기
        // 정해진 출력값의 길이 설정 및 한자리 수를 입력할 경우 빈 공간에는 0을 넣어서 출력
//        String yy = String.format("%04d", ymd3[0]);
//        String mm = String.format("%02d", ymd3[1]);
//        String dd = String.format("%02d", ymd3[2]);
//        System.out.println(dd+"-"+mm+"-"+yy);


        // 1020 - 주민번호 입력받아 형태 바꿔 출력하기
//        String num = sc.nextLine();
        // substring으로 '-'기준 앞/뒤로 나눠주기
//        String front = num.substring(0,6);
//        String back = num.substring(7);
//        System.out.println(front+back);
        // 또는 split 메소드 이용
//        String num2 = sc.nextLine();
//        String[] divider = num2.split("\\-");
        // String.valueOf를 통해 인자(어떠한 형태이든)를 문자열 객체로 형변환 > 근데 굳이 여기서 쓸 필요가?
//        String front2 = String.valueOf(divider[0]); // divider[0]로도 가능
//        String back2 = String.valueOf(divider[1]); // divider[1]로도 가능
//        System.out.println(front2+back2);
        // 또는 replace 메소드 이용
        // replace: 문자열 치환 > 변경하고 싶은 문자열을 찾아 치환(찾을 문자열, 바꿀 문자열)
//        String num3 = sc.nextLine();
//        System.out.println(num3.replace("-",""));

        // 1021 - 단어 1개 입력받아 그대로 출력하기
//        String word = sc.next();
//        System.out.println(word);

        // 입력 버퍼 제거
//        sc.nextLine();
        // 1022 - 문장 1개 입력받아 그대로 출력하기
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        // 1023 - 실수 1개 입력받아 부분별로 출력하기
//        String[] num = sc.next().split("\\.");
//        int numA = Integer.parseInt(num[0]);
//        int numB = Integer.parseInt(num[1]);
//        System.out.println(numA+"\n"+numB);
        // 또는 StringTokenizer 사용
        // > 단 한 개의 구분자만을 사용할 수 있으므로 복잡한 구분자를 사용해야 할 때는 Scanner나 split을 사용해야 한다.
//        String num2 = sc.next();
//        StringTokenizer st = new StringTokenizer(num2,".");
//        while (st.hasMoreElements()) {
//            System.out.println(st.nextToken());
//        }
        // String.format 사용
//        String[] num3 = sc.next().split("\\.");
//        int numa = Integer.parseInt(num3[0]);
//        int numb = Integer.parseInt(num3[1]);
//        System.out.printf(String.format("%d\n%d",numa, numb));

        // 1024 - 단어 1개 입력받아 나누어 출력하기
//        String word = sc.next();
//        for(int i =0; i < word.length(); i++) {
//            System.out.println("\'" + word.charAt(i) + "\'");
//        }

        // 1025 - 정수 1개 입력받아 나누어 출력하기
//        String[] number = sc.next().split("");
//        System.out.println("[" + Integer.parseInt(number[0]) * 10000 + "]");
//        System.out.println("[" + Integer.parseInt(number[1]) * 1000 + "]");
//        System.out.println("[" + Integer.parseInt(number[2]) * 100 + "]");
//        System.out.println("[" + Integer.parseInt(number[3]) * 10 + "]");
//        System.out.println("[" + Integer.parseInt(number[4])  + "]");

        // 1026 - 시분초 입력받아 분만 출력하기
//        String[] time = sc.next().split(":");
//        String h = time[0];
//        String m = time[1];
//        String s = time[2];
//        System.out.println(m);

        // 1027 - 년월일 입력 받아 형식 바꿔 출력하기
//        String[] date = sc.next().split("\\.");
//        int yy = Integer.parseInt(date[0]);
//        int mm = Integer.parseInt(date[1]);
//        int dd = Integer.parseInt(date[2]);
//        System.out.printf("%02d-%02d-%04d",dd,mm,yy);
        // 쉬운 버전^^
//        String[] date2 = sc.next().split("\\.");
//        System.out.println( date2[2] + "-" + date2[1] + "-" + date2[0]);;

        // 1028 - 정수 1개 입력받아 그대로 출력하기2
        // 정수를 표현하기 위한 자료형 int / long
        // 둘의 차이점은 메모리 사용량 ! int = 32bit / long = 64bit > 표현 가능한 정수 범위가 다름
//        Long numm = sc.nextLong();
//        System.out.println(numm);

        // 1029 - 실수 1개 입력받아 그대로 출력하기2
        // 메모리 공간 크기 = float < double
//        double nuum = sc.nextDouble();
//        System.out.println(String.format("%.11f",nuum));

        // 1030 - 정수 1개 입력받아 그대로 출력하기3
        // int 범위: -2147483648 ~ +2147483647 그 이상의 범위 표현하고자 할 때 Long으로 사용
//        Long i = sc.nextLong();
//        System.out.println(i);


        //22.04.20=====================================================================================

        // 1031 - 10진 정수 1개 입력받아 8진수로 출력하기
        // printf() 활용 > %o : 8진수로 변환
//        int ln = sc.nextInt();
//        System.out.printf("%o", ln);
        // 또는 toOctalString() 활용
//        int an = sc.nextInt();
//        String octal = Integer.toOctalString(an);
//        System.out.println(octal);

        // 1032 - 10진 정수 입력받아 16진수로 출력하기1
        // printf() 활용 > %x : 16진수로 변환
//        int bn = sc.nextInt();
//        System.out.printf("%x",bn);
        // 또는 toHexString() 활용
//        int cn = sc.nextInt();
//        String hex = Integer.toHexString(cn);
//        System.out.println(hex);

        // 1033 - 10진 정수 입력받아 16진수로 출력하기2 > 대문자
//         printf() 활용 > %X : 16진수 대문자로 변환
//        int fn = sc.nextInt();
//        System.out.printf("%X",fn);
        // 또는 toHexString() + toUpperCase() 활용
//        int dn = sc.nextInt();
//        String heX = Integer.toHexString(dn).toUpperCase();
//        System.out.println(heX);

//        sc.nextLine();

        // 1034 - 8진 정수 1개 입력받아 10진수로 출력하기
        // string으로 입력받고, 8진수 int(10진수) 타입으로 변환 > valueOf 활용
//        String en = sc.nextLine();
//        int a = Integer.valueOf(en,8);
//        System.out.println(a);
        // string으로 입력받고, 8진수 int 타입으로 변환 > parseInt 활용
//        String hn = sc.nextLine();
//        int b = Integer.parseInt(hn,8);
//        System.out.println(b);

        // 1035 - 16진 정수 1개 입력받아 8진수로 출력하기
        // string으로 입력받고, 16진수를 10진수로 변환 후 8진수로 출력 (16진수 > 8진수 변환방법 = 10진수가 아닌 이외의 수들 동일)
        // parseInt(), toOctalString() 활용
//        String mn = sc.nextLine();
//        int c = Integer.parseInt(mn,16);
//        System.out.println(Integer.toOctalString(c));
        // valueOf(), prinf() 활용
//        String nn = sc.nextLine();
//        int d = Integer.valueOf(nn,16);
//        System.out.printf("%o",d);

        // 1036 - 영문자 1개 입력받아 10진수로 출력하기
        // 문자열로 받고 1자 잘라준 다음 int로 형변환
//        char c1 = sc.nextLine().charAt(0);
//        int e = (int)c1;
//        System.out.println(e);
        // 축약버전
//        char c2 = sc.nextLine().charAt(0);
//        System.out.println((int)c2);

        // 1037 - 정수 입력받아 아스키 문자로 출력하기
//        int i1 = sc.nextInt();
//        char i2 = (char)i1;
//        System.out.println(i2);
        // 축약버전
//        int i3 = sc.nextInt();
//        System.out.println((char)i3);


        //22.04.21=====================================================================================

        // 1038 - 정수 2개 입력받아 합 출력하기1
        // 입력되는 정수(int)는 -1073741824 ~ 1073741824 이다. == int의 범위
        // 1073741824 + 1073741824 > int 범위를 벗어남 (-2,147,483,648 ~ 2,147,483,647)
        // long 타입으로 형변환 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
//        long n1=sc.nextInt(), n2=sc.nextInt();
//        System.out.println(n1+n2);
        // 또는 long.valueOf()
//        int c1= sc.nextInt(), c2= sc.nextInt();
//        Long d1 = Long.valueOf(c1);
//        Long d2 = Long.valueOf(c2);
//        System.out.println(d1+d2);
        // 또는 (long)
//        int a1= sc.nextInt(), a2=sc.nextInt();
//        Long b1 = (long) a1;
//        Long b2 = (long) a2;
//        System.out.println(b1+b2);

//        sc.nextLine(); // 객체 닫기

        //1039 - 정수 2개 입력받아 합 출력하기2
        // 2개의 정수가 공백으로 입력 > split으로 나눠주기
        // Long으로 형변환 후 합 출력
//        String ab = sc.nextLine();
//        String [] abab = ab.split(" ");
//        Long a = Long.parseLong(abab[0]);
//        Long b = Long.parseLong(abab[1]);
//        System.out.println(a+b);
        // 또는 StringTokenizer 사용
        // > 단 한 개의 구분자만을 사용
//        String bc = sc.nextLine();
//        StringTokenizer de = new StringTokenizer(bc, " ");
//        String [] dede = new String[2];
//        int i = 0;
//        while (de.hasMoreElements()) {
//            dede[i] = de.nextToken(); //de에 토큰이 있으면 담아주기
//            i++;
//        }
//        Long bb = Long.valueOf(dede[0]);
//        Long cc = Long.valueOf(dede[1]);
//        System.out.println(bb+cc);

        // 1040 - 정수 1개 입력받아 부호 바꿔 출력하기
//        int f = sc.nextInt();
//        System.out.println(f*-1);

        // 1041 - 문자 1개 입력받아 다음 문자 출력하기
        // 문자형으로 입력 후 10진수로 변환 +1 > 문자열 변환
//        char s = sc.next().charAt(0);
//        int h = (int)s+1;
//        char j = (char)h;
//        System.out.println(j);
        // 축약형 버전
//        char k = sc.next().charAt(0);
//        System.out.println((char)(k+1));

        // 1042 - 정수 2개 입력받아 나눈 몫 출력하기
//        int i1 = sc.nextInt(), i2 = sc.nextInt();
//        System.out.println(i1/i2);

        // 1043 - 정수 2개 입력받아 나눈 나머지 출력하기
//        int i3 = sc.nextInt(), i4 = sc.nextInt();
//        System.out.println(i3%i4);

        // 1044 - 정수 1개 입력받아 1 더해 출력하기
        // int 범위 끝 = 2,147,483,647 + 1을 할 경우를 대비해서
        // long 타입으로 형변환 (-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
//        long i5 = sc.nextInt();
//        System.out.println(i5+1);

//        sc.nextLine();

        // 1045 - 정수 2개 입력받아 자동 계산하기
//        String list = sc.nextLine();
//        String [] str = list.split(" ");
//        int i6 = Integer.parseInt(str[0]);
//        int i7 = Integer.parseInt(str[1]);
//        System.out.println(i6 + i7);
//        System.out.println(i6 - i7);
//        System.out.println(i6 * i7);
//        System.out.println(i6 / i7);
//        System.out.println(i6 % i7);
//        System.out.printf("%.2f",(double)i6/i7);
        // 한꺼번에 출력
//        System.out.println((i6+i7)+"\n"+(i6-i7)+"\n"+(i6*i7)+"\n"+(i6/i7)+"\n"+(i6%i7));
//        System.out.printf("%.2f",(double)i6/i7);

        // 1046 - 정수 3개 입력받아 합과 평균 출력하기
//        String list2 = sc.nextLine();
//        String [] str2 = list2.split(" ");
//        int i9 = Integer.parseInt(str2[0]);
//        int i10 = Integer.parseInt(str2[1]);
//        int i11 = Integer.parseInt(str2[2]);
//        System.out.println(i9 + i10 + i11);
//        System.out.printf("%.1f",(double)((i9+i10+i11)/3));


        //22.04.24=====================================================================================

        // 1047 - 정수 1개 입력받아 2배 곱해 출력하기
        // *2의 값을 출력해도 되지만,
        // 정수를 2배로 곱하거나, 나누어 계산해 주는 비트단위시프트 연산자 <<, >>를 이용해보기
        int a = sc.nextInt();
//        System.out.printf("%d", a<<1); // a를 2배한 값 출력
        System.out.println(a<<1);

        // 1048 - 한 번에 2의 거듭제곱 배로 출력하기
        int b = sc.nextInt(), c = sc.nextInt();
//        System.out.printf("%d",b<<c); // b를 2의 c배 곱한 값
        // Math.pow(밑, 지수) 사용 = 제곱함수
        // 기본 타입이 실수형이기 때문에 int타입으로 형변환
        System.out.println((int)(b*Math.pow(2,c)));

        // 1049 - 두 정수 입력받아 비교하기1
        int d = sc.nextInt(), e = sc.nextInt();
        if (d>e)
            System.out.println(1);
        else if (d<=e)
            System.out.println(0);

        // 1050 - 두 정수 입력받아 비교하기2
        int f = sc.nextInt(), g = sc.nextInt();
        if (f == g) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // 1051 - 두 정수 입력받아 비교하기3
        int h = sc.nextInt(), i = sc.nextInt();
        // if 삼항 연산자 활용
        int result = h <= i ? 1 : 0;
        System.out.println(result);

        // 1052 - 두 정수 입력받아 비교하기4
        int j = sc.nextInt(), k = sc.nextInt();
        int result2 = j != k ? 1 : 0;
        System.out.println(result2);

        // 1053 - 참 거짓 바꾸기
        int l = sc.nextInt();
        System.out.println(l == 0 ? 1 : 0);

        // 1054 - 둘 다 참일 경우만 참 출력하기
        int m = sc.nextInt(), n = sc.nextInt();
        System.out.println( m==n?1:0);

        // 1055 - 하나라도 참이면 참 출력하기
        int o = sc.nextInt(), p = sc.nextInt();
        System.out.println(o==1||p==1?1:0);

        // 1056 - 참/거짓이 서로 다를 때에만 참 출력하기
        int q = sc.nextInt(), r = sc.nextInt();
        System.out.println(q==1&&r==0?1:0);

        // 1057 - 참/거짓이 서로 같을 때에만 참 출력하기
        int s = sc.nextInt(), t = sc.nextInt();
        System.out.println(s==t?1:0);

        // 1058 - 둘 다 거짓일 경우만 참 출력하기
        int u = sc.nextInt(), v = sc.nextInt();
        System.out.println(u==0&&v==0?1:0);
    }
}
