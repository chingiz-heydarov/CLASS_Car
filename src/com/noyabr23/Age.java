package com.noyabr23;

public class Age {
    public static void main(String[] args) {

        Minor m1 = new Minor(34, "Ozune baxan adam n1", 0, 1800, true, 45);
        Minor m2 = new Minor(24, "Ozune baxan adam n2", 0, 2700, false, 56);
        Minor m3 = new Minor(29, "Ozune baxan adam n3",0, 3100, true, 50);

        Fehle f1 = new Fehle(23, "Fehle1",0, 10, false, true);
        Fehle f2 = new Fehle(31, "Fehle2",0, 9, false, false);
        Fehle f3 = new Fehle(45, "Fehle3",0, 8, true, false);

        Standard s1 = new Standard(32, "Ozune baxmayan n1",0, 900, true, 40);
        Standard s2 = new Standard(28, "Ozune baxmayan n2",0, 1100, true, 45);
        Standard s3 = new Standard(38, "Ozune baxmayan n3",0, 1700, false, 56);

        Evdar e1 = new Evdar(37, "Evdar qadin n1",0, 2, false, false);
        Evdar e2 = new Evdar(34, "Evdar qadin n2",0, 2, true, false);
        Evdar e3 = new Evdar(44, "Evdar qadin n3",0, 3, false, true);

        AA a1 = new AA(35, "AA qurumunun numayendesi n1", 0, 9, false, false, false, false);
        AA a2 = new AA(39, "AA qurumunun numayendesi n2",0, 18, true, false, true, false);
        AA a3 = new AA(52, "AA qurumunun numayendesi n3",0, 25, true, true, true, true);
        AA a4 = new AA(44, "AA qurumunun numayendesi n4",0, 18, true, true, false, false);


        Routine[] rutin = {m1, m2, m3, f1, f2, f3, s1, s2, s3, e1, e2, e3, a1, a2, a3, a4,};

        for (Routine tt : rutin) tt.stress();

        Fat[] fat = {s1, s2, s3, a1, a2, a3, a4, e1, e2, e3};

        for (Fat tt : fat) tt.movingless();

        BadHabit[] bad = {s1, s2, s3, f1, f2, f3, a1, a2, a3, a4};

        for (BadHabit tt : bad) {
            tt.alchogolyzm();
            tt.smoking();
        }

        Doner[] doner = {s1, s2, s3, f1, f2, f3};

        for (Doner tt : doner) tt.FastFood();

        Goodhabit[] good = {m1, m2, m3};

        for (Goodhabit tt : good) {
            tt.workout();
            tt.regularSex();
        }

        Human[] humans = {m1, m2, m3, f1, f2, f3, s1, s2, s3, e1, e2, e3, a1, a2, a3, a4,};


        for (Human tt : humans) {
            if (tt.deathCount < 0) tt.age = tt.age * 3 / 2 - tt.deathCount;
            else if (tt.deathCount < 50) tt.age = tt.age + 60 - tt.deathCount;
            else if (tt.deathCount < 80) tt.age = tt.age + 90 - tt.deathCount;
            else if (tt.deathCount < 165) tt.age= 180 - tt.deathCount;
            else tt.age+= 210 - tt.deathCount;
            System.out.println(tt.name+"  bele davam elese  "+tt.age + "  yasina kimi yasayacaq.");
        }
    }
}


