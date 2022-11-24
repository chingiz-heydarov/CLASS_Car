package com.noyabr23;

class Evdar extends Human implements Fat, Routine {
    int children;
    boolean qaynana;

    boolean lover;

    Evdar(int age, int deathCount, int children, boolean lover, boolean qaynana) {
        this.age = age;
        this.lover = lover;
        this.children = children;
        this.qaynana = qaynana;
        this.deathCount=deathCount;
    }

    @Override
    public int movingless() {
        deathCount += 50;
        return deathCount;
    }

    @Override
    public int stress() {
        if (qaynana) deathCount += 25;
        if (lover) deathCount -= 15;
        deathCount *= children;
        return deathCount;
    }
}