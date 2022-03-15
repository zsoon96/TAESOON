package com.programmers;

class Mr_kim {
    public String solution(String[] seoul) {
        int x = 0;
        for (String name : seoul) {
            if(name.equalsIgnoreCase("Kim"))
                break;
            x++;
        }
        return "김서방은 "+ x +"에 있다";
//        String answer = "";
//
//        for (int i = 0 ; i < seoul.length; i++) {
////            #01
////            if ( seoul[i] == "Kim") {
////                answer = "김서방은 " + i + "에 있다.";
////            }
//
////             #02
//            // .equals() 메소드 : 객체끼리의 문자열(내용) 비교 메소드
//            // == 비교연산자 : 주소값을 비교하는 연산자 (실제 내용 값이 아닌 자료의 위치~)
//            if(seoul[i].equals("Kim")) answer = "김서방은 " + i + "에 있다.";
//
//        }
//        return answer;
    }
    public static void  main(String[] args){
        Mr_kim se = new Mr_kim();
        String [] a = {"Jane","Kim"};
        System.out.println(se.solution(new String[]{"Jane"}));
    }

}
