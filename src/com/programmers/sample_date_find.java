package com.programmers;

//조건 arr2 에서 29 넘는 시간 다 21로 바꿔
class sample_date_find {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0; // 뺀 값;;
        for(int i = 0; i < arr1.length; i++){
            if(arr2[i] > 29){arr2[i] = 21;}
            answer += arr2[i] - arr1[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        sample_date_find method = new sample_date_find();
        int[] arr1 = {9,9,9,9,7,9,8};
        int[] arr2 = {23,23,30,28,30,23,23};
        System.out.println(method.solution(arr1, arr2));
    }
}


