package com.programmers;

class phone_number {
    public String solution(String phone_number) {
            StringBuilder answer = new StringBuilder(phone_number);
            //String 에 담기는 값은 불변하기 때문에 StringBuilder 나 StringBuffer를 사용하는 것이 좋다.
            for(int i = 0; i < phone_number.length()-4; i++){
                //전화번호 뒷 4자리는 보여줄 것이기 때문에 phone_number 의 길이에 -4를 하면 되고
                answer.setCharAt(i, '*');
                // 뒤에 뺀 4자리 앞에 인덱스 까지 '*'롤 붙여주는 것이다.
            }
            return answer.toString();
            // concat, + 와 같은 메서드는 기존 String의 값을 버리고 새로운 값을 할당하는 것이다.
            // 그렇기 떄문에 앞서 열거한 두가지 메서드는 지양하는 것이 좋을 듯.
    }
    public static void  main(String[] args){
        phone_number se = new phone_number();
        System.out.println(se.solution("0647125012"));
    }

}
