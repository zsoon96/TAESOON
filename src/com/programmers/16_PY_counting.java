package com.programmers;

class equals {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        // 입력받는 소문자를 다 대문자로 바꿔라!


            int yCout = 0;
            int pCout = 0;

        for(int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == 'Y') {
                // 주의사항 다 대문자로 변경하는 문법을 사용해서 대문자로 써줘야 한다.
                yCout++;
            } else if (s.charAt(i) == 'P') {
                pCout++;
            }
            if(yCout==pCout){
                answer = true;
            } else{
                answer = false;
            }
        }
        return answer;

    }
    public static void  main(String[] args){
        equals se = new equals();
        System.out.println(se.solution("PpYy"));
    }
}
