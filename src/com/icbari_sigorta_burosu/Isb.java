package com.icbari_sigorta_burosu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Isb {
    public static void main(String[] args) throws IOException, InterruptedException {

        String nomer = "", kod = "", seria = "", random = "";

        String[] kods = {"10","90", "99"};

        FileWriter output = new FileWriter("nomreler_2.txt");

        File output_file = new File("nomreler_2.txt");

        System.out.println(output_file.getAbsolutePath());

        Waitor waitor= new Waitor();


        for (String z : kods) {
            kod=z;
            for (char i = 'a'; i <= 'z'; i++) {
                if (i == 'i' || i == 'q' || i == 'w' || i=='y') continue;
                for (char j = 'a'; j <= 'z'; j++) {
                    if (j == 'i' || j == 'q' || j == 'w') continue;
                    seria = "" + i + j;
                    for (int k = 1; k < 1000; k++) {
                        if (k < 10) random = "00" + k;
                        else if (k < 100) random = "0" + k;
                        else random = "" + k;
                        nomer = kod + seria + random;
                       output.write(nomer);
                       output.append('\n');
                   //    waitor.run(nomer);
                    //   waitor.wait(1000);
                    }
                }
            }
        }
    }
}

class Waitor extends Thread{
    public void run(String local){
        System.out.println(local);
    }
}
