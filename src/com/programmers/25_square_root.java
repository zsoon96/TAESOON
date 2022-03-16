package com.programmers;

class square_root {
    public long solution(long n) {
        long answer = 0;
        double nn = Math.sqrt(n);

        if(n%nn==0){
            answer += Math.pow(nn+1,2);
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
        System.out.println(se.solution(9));
    }


}
