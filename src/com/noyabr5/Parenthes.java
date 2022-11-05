package com.noyabr5;

public class Parenthes {
    public static void main(String[] args) {

        String s="(())()()())))()()()()((((";
        int count=0, oldc=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                count++;
                i++;
            }
            else if(count!=0){
                oldc=count;
                count=0;
            }
        }
        System.out.println(oldc);
    }
}
