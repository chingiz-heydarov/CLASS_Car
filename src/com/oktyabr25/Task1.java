package com.oktyabr25;

public class Task1 {
    public static void main(String[] args) {
        int a[]= {9,9,9,8,9};
        int i,l=a.length-1,sum=0;
        for(i=0;i<=l;i++) {
            sum+=a[i]*(Math.pow(10,l-i));
        }
        sum+=1;
        if(sum==Math.pow(10,l+1)) l+=1;

        int b[]=new int[l+1];

        for(i=0;i<=l;i++){
             b[i]=sum/(int) Math.pow(10,l-i);
             sum=sum%((int) Math.pow(10,l-i));
        }
        for( int z: b){
            System.out.print(z+"\t");
        }
        }
    }
