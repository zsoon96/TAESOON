package com.programmers;

class split {
    public String solution(String s) {
        String answer = "";
        String [] ss = s.split("");
        System.out.println(ss);
        int index = 0;

        for(int i = 0; i < ss.length; i++){
            if(ss[i].equals(" ")){
                index = 0;
            } else{
                if(index%2 == 0){
                    ss[i]= ss[i].toUpperCase();
                    index++;
                } else if(index%2 != 0){
                    ss[i]= ss[i].toLowerCase();
                    index++;
                }
            }
            answer += ss[i];
        }

        return answer;

//        String answer = "";
//        int cnt = 0;
//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }
//        return answer;













    }

    public static void main(String[] args) {
        split method = new split();
        System.out.println(method.solution("try hello world"));
    }



}
