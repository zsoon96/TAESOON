package com.company;

// 01ㅣ입력 값이 1일 될 때까지 반복문 실행
// 02ㅣ반복문 안에서 짝수일 때, 홀수일 때 조건 설정
// 02ㅣ작업 횟수가 500번이 되면 -1 값을 리턴 후 반복문 종료

class Collatz_conjecture {
    public int solution(int num) {
        int n = num; // 입력 값
        int answer = 0; // 반복 횟수

        // n이 1이 아니면서 500이 되기 전까지 반복문 실행
        // n=1 과 answer = 500일 경우 조건이 False가 되면서 종료
        while (n != 1 && answer != 500) {
            if (n % 2 == 0) { // num이 짝수일 때
                n = n / 2; // num / 2의 값을 n에 담기
            } else if (n % 2 == 1) { // 위 조건이 거짓이면
                n = (n * 3) + 1; // num * 3 + 1의 값을 n에 담기
            }
            answer++; // 위의 식이 한번 씩 반복할 때마다 answer값 1씩 증가
        }
        if (answer == 500) { // answer가 500이라면 answer = -1 출력
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Collatz_conjecture se = new Collatz_conjecture();
        System.out.println(se.solution(6));
    }
}

