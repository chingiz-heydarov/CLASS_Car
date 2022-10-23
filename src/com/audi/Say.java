package com.audi;

public class Say {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        int i, j = 0, bos = 0, count=0, say = 2, l = a.length ;

        boolean result = true;
//        LOOP:do {
//            int count = 0;

            for (i = 0; ; i++) {
                 if (i == l) i = 0;

                //boslarin uzerinden kecirik
                if (a[i] == 0) {
                    continue;
                } else count++;

                //
                if (count == say) {
                    a[i] = 0;
                    bos++;
                    count=0;
//                    j = i + 1;
//                    break;
                }

                if (bos==l-1) break ;
            }
            System.out.println(bos);
//        } while (result);
        for (int z : a) System.out.print(z + "\t");
    }
}