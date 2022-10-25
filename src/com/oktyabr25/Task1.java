package com.oktyabr25;

public class Task1 {
    public static void main(String[] args) {
        int a[]= {9,9,9,9,9};
        int i,l=a.length-1,sum=0;
        for(i=0;i<=l;i++) {
            sum+=a[i]*(Math.pow(10,l-i));
        }
        sum+=1;

        String s=""+sum;

       if(sum==Math.pow(10,l+1)) l+=1;

    //    char b[]=new char[l+1];

        for(i=0;i<=l;i++){
          //   b[i]= s.charAt(i);
               System.out.print(s.charAt(i)+"\t");
         //   System.out.println(b[i]);
        }
  /*      for( int z: b){
            System.out.print(z+"\t");
        }                                  */
        }
   }
