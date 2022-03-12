package com.company;

import java.util.Arrays;

public class row_cilumn_plus {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // answer == arr1의 length 는 행의 길이 가졌다는 것을 의미
        // arr1의 0번째 인덱스의 length는 첫 번째 행의 0번째 열의 길이를 의미
        // 여기서 잠깐 이렇게 answer [][] 값을 선언할 수 있는 이유는 arr1[][]==arr2[][]는 같은 크기라서
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
    public static void  main(String[] args){
        row_cilumn_plus se = new row_cilumn_plus();
        int arr1 [][] ={{1},{2}};
        int arr2 [][]= {{3},{4}};
        System.out.println(Arrays.deepToString(se.solution(arr1, arr2)));
    }

}
