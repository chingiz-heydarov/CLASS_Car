package com.noyabr21;

public class Chassis {
    static boolean classic;
}

class Awd extends Chassis{
    static String trans;
    Awd(String trans, boolean classic){
        super.classic=classic;
        this.trans=trans;
    }
}
