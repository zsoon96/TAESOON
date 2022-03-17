package com.programmers;

class jin {
    public int solution(int n) {
        int answer = 0;
        String j = Integer.toString(n,3);

        for(int i = 0; i < j.length(); i++){
            answer+= ((int)j.charAt(i) - '0') * (Math.pow(3,i));
        }
        return answer;
    }
    public static void main(String[]args){
        jin method = new jin();
        System.out.println(method.solution(45));
    }

}
