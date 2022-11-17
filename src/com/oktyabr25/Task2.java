package com.oktyabr25;

public class Task2 {
    public static void main(String[] args) {
        String sent ="sssnnnaaa";

        int i,j,old_count=1,count=1, l= sent.length();
        char sent_i;
        String pot_i = "";

        for(i=0;i<l;i++){
            sent_i=sent.charAt(i);
            count=1;
            for(j=i+1;j<l;j++) {
                if (sent_i == sent.charAt(j))
                    count++;
            }
                if(count>old_count) {
                    old_count = count;
                    pot_i = "" + sent.charAt(i) + "";

                }
                if(count==old_count){
                    pot_i=pot_i+sent.charAt(i);
                }

        }


        if(pot_i.length()==1)
            System.out.println("Cumlede en cox olan '"+pot_i+"' herfidir, "+old_count+" defe tekrerlanir.");
           else{
               pot_i=pot_i.substring(1);
               System.out.print("Cumlede en cox olan ");

               for(i=0;i<pot_i.length();i++){
                   System.out.print(pot_i.charAt(i)+", ");
               }

              System.out.println("herfleridir, "+old_count+" defe tekrerlanir.");
        }
    }
}
