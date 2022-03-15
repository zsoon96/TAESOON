package com.programmers;

import java.util.Arrays;
import java.util.Collections;

class back_num {
    public String solution(int n) {
        String ss = Integer.toString(n);
        String[] num = ss.split("");
        Arrays.sort(num,Collections.reverseOrder());

        return Arrays.toString(num);
    }
    public static void main(String[] args) {
        back_num method = new back_num();
        System.out.println(method.solution(12345));
    }
}
