package com.oktyabr27;

public class StringMethod {
    public static void main(String[] args) {
        String w[]={"unt","er","gehen"};
        String st="untergehen";
        int i=0,j=0,x,y,a=0,k,total=0, Stl=st.length();

        for(x=0;x<w.length;x++){
            int l=w[x].length();
            total+=l;
        }
        if(total<Stl) Stl=total;

     outer:   while(i!=Stl){
            int l=w[j].length();
            for(i=a,k=0;k<l;i++,k++){
               if(st.charAt(i)!=w[j].charAt(k)) break outer;
               // System.out.print(w[j].charAt(k)+"\t");
            }
            a+=l;
            j++;
        }

        if(i==Stl) System.out.println("true");
        else System.out.println("false");
    }
}
