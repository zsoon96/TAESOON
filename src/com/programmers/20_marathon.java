package com.programmers;

import java.util.Arrays;

class marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
//        int i;
//        int i = 0;
        for(int i = 0; i < completion.length; i++){
                if(!participant[i].equals(completion[i])){
                    return participant[i];
                }

        }
        return participant[participant.length-1];

    }
    public static void  main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        marathon se = new marathon();
        System.out.println(se.solution(participant,completion));
    }
}
