package com.october31;

public class LongestEntrance {
    public static void main(String[] args) {
        String s = "audi_rs6_audi_s_8_audi_s_5_audi_rsq_5";

        int size = 0;

        for (int l = 2; l <= s.length() / 2; l++) {
            for (int i = 0; i < l; i++) {
                for (int j = i; j <= s.length() - l; j += l) {
                    size++;
                }
            }
        }

        String[] sb = new String[size];
        int k=0;

        for (int l = 2; l <= s.length() / 2; l++) {
            for (int i = 0; i < l; i++) {
                for (int j = i; j <= s.length() - l; j += l) {
                sb[k]=s.substring(j,j+l);
                k++;
                }
            }
        }
        int x=0,c=0;


        for(int i=0; i<sb.length-1; i++) {
            int count = 0;
            for (int j = i + 1; j < sb.length; j++) {
                if (sb[i].equals(sb[j])) count++;
            }
            if (count > c) {
                c = count;
                x = i;
            }
            if(count==c){
                if(sb[i].length()>sb[x].length()){
                    c=count;
                    x=i;
                }
            }
        }
        System.out.println("'"+sb[x]+"'"+" soz birlesmesi "+(c+1)+" defe tekrerlanir");
    }
}