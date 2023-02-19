package fevral18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Fayl {
    public static void main(String[] args) throws IOException, InterruptedException {


        FileWriter wrt = new FileWriter("datt.txt");

        //   File ff = new File("dat.txt");

        int day, month, year;


        Random rday = new Random();

        for (int i = 0; i < 50; i++) {

            day = rday.nextInt(30) + 1;
            month = rday.nextInt(11) + 1;
            year = rday.nextInt(123) + 1900;

            String sday, smonth, syear;

            if (day < 10) sday = "0" + day;
            else sday = "" + day;

            if (month < 10) smonth = "0" + month;
            else smonth = "" + month;

            String dat = sday + "-" + smonth + "-" + year;
            System.out.println(dat);
            wrt.write(dat);
            wrt.append('\n');
        }
        //  System.out.println(ff.getAbsolutePath());
    }
}
