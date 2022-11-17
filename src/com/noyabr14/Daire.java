package com.noyabr14;

class Daire implements Area{
    int r;
    Daire(int x){
       this.r=x;
    }

    @Override
    public void formula(){
         System.out.println(Math.PI*r*r);
    }
}
