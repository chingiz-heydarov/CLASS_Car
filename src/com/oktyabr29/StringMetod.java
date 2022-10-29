package com.oktyabr29;

public class StringMetod {
    public static void main(String[] args) {
        String s[] = {"Au","di","av", "aav","Av","ant"};
        String str = "AudiAvant", sum;
        int i,j,l=s.length-1;
  outer:   for(i=0;i<l-1;i++){
                sum=s[i];
                for(j=i+1;j<=l;j++){
                        if((str.substring(0,(sum.length()+s[j].length()))).equals(sum+s[j])) sum+=s[j];
                        if(str.equals(sum)){
                            System.out.println("true");
                            break outer;
                        }
            }
                if(i==l-2)System.out.println("false");
        }
    }
}