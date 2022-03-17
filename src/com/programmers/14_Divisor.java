package com.programmers;

// 자바 패키지 설치
import java.util.*;
import java.util.ArrayList;

        // Array !!!!
        // 고정 길이 데이터 구조
        // 배열 인덱스로 식별되는 요소의 컬렉션으로 구성된 데이터 구조
        // Java 프로그래밍의 일부


class Divisor{
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        // AraayList !!!!
        // 가변 길이 Collection 클래스
        // 필요할 때마다 커질 수 있는 동적 배열을 지원하는 클래스
        // Collection 프레임 워크의 일부

        for (int a : arr) {
            if (a % divisor == 0) list.add(a);
        }
        if (list.size() == 0) return new int[]{-1};

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Divisor div = new Divisor();
        int[] array = {5, 9, 7, 10};
        // Arrays.toString을 사용해서 배열 내용 출력해야 함 !!!!!!
        // 왜냐면 자바의 배열은 혼자 출력 못한댄요 ^^
        System.out.println( Arrays.toString( div.solution(array, 5) ));
    }

}
