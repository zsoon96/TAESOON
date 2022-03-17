package com.programmers;

class N_split {
    public int solution(int n) {
        String str = Integer.toString(n);
        char ch;
        int sum =0;

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            sum += Character.getNumericValue(ch);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return sum;
    }
    public static void  main(String[] args){
        N_split se = new N_split();
        System.out.println(se.solution(123));
    }

}
