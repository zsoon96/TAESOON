package com.programmers;

import java.util.Arrays;

class min_num {
    public int[] solution(int[] arr) {
        int[] answer = {};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        return answer;
    }
    public static void  main(String[] args){
        min_num se = new min_num();
        int [] a = {4,3,2,1};
        System.out.println(se.solution(a));
    }

}
