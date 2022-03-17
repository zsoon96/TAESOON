package com.programmers;

class square_root {
    public long solution(long n) {  // 자료형 연산 관계 찾아보기!!! ///
        long answer = 0;
        double nn = Math.sqrt(n); // 제곱근 찾기

        if(n%nn==0){
            answer += Math.pow(nn+1,2); // 제곱해주기
        }else{
            answer = -1;
        }
        return answer;

//        if (Math.pow((int)Math.sqrt(n), 2) == n) {
//            // n의 제곱근의 제곱이 n 과 같을 때
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//            // 리턴 값으로 n에 제곱근 + 1 한 값의 제곱한 수를
//        }
//        return -1;
//        // -1을 리턴하시오.

    }
    public static void  main(String[] args){
        square_root se = new square_root();
        System.out.println(se.solution(5));
    }


}
