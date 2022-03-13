package com.company;

public class none_number_plus {
    public int solution(int[] numbers) {
        // 0 - 9 까지 숫자 중, 일부 숫자가 담긴 배열이 있다.
        // 위 범위 중 그 배열에 없는 숫자의 합을 구해라!
        // 식 > 0-9 전체수의 합 - 입력받은 배열 수의 합
        int sum = 45;//0 - 9 까지의 합

//        for each 문 구조 이해하기
//        for ( int number : numbers){
//            sum -= number;
//        }
//        for(int i = 0; i < numbers.length; i++){
//
//            sum -= numbers[i];
//        }
//         자바 스트림; 강제할당;
        return sum;
    }
    public static void  main(String[] args){
        none_number_plus se = new none_number_plus();
        int number[] = {1,2};
        System.out.println(se.solution(number));
    }



}
