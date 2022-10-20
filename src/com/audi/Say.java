package com.audi;

public class Say {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};

        int i ,j=0, Null=0 ,Count, say=5, l=a.length-1;

boolean result=true;
        do{
            Count=0;

            for(i=j; Count<=say; i++) {
               // if (i == l) i = 0;
                if (a[i] == 0) {
                    Null++;
                    continue;
                }
                else Count++;

                if (Count == say) {
                    a[i] = 0;
                    j = i+1;
                    break;
                }
                if (i == l) i = 0;
                 if(Null-Count==l-1) result=false;
            }
            System.out.println(Null);
        }while(result);
        for(int z: a) System.out.print(z+"\t");
    }
}