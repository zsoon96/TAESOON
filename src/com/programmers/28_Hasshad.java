package com.programmers;

import java.util.Arrays;

class Hasshad {
    public boolean solution(int x) {
        boolean answer;
//        int sum = 0;

        String str1 = Integer.toString(x);
        String[] array = str1.split("");
        int[] arr = new int[array.length];
        for(int i=0; i<array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
//            sum += Integer.parseInt(array[i]);
        }
//        System.out.println(Arrays.toString(arr));
        if(x % (arr[0]+arr[1])==0) { // 18 % 9 == 0 //연산자 우선순위
//        if(x % sum == 0)
            answer = true;

        } else{
            answer = false;
        }
        return answer;











    }
    public static void  main(String[] args){
        Hasshad se = new Hasshad();
        System.out.println(se.solution(18));
    }
}
