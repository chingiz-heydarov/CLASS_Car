package com.noyabr23;

class Standard extends Office implements Doner, BadHabit {
    Standard(int age, String name, int deathCount, int maas, boolean holiday, int workhours) {
        this.age = age;
        this.maas = maas;
        this.holiday = holiday;
        this.workhours = workhours;
        this.deathCount=deathCount;
        this.name=name;
    }

    @Override
    public int movingless() {
        deathCount += 50;
        return deathCount;
    }

    @Override
    public int alchogolyzm() {
        deathCount += 50;
        return deathCount;
    }

    @Override
    public int smoking() {
        deathCount += 35;
        return deathCount;
    }

    @Override
    public int FastFood() {
        deathCount += 25;
        return deathCount;
    }

    @Override
    public int stress() {
        if (!holiday) deathCount += 10;
        deathCount += workhours - 40;
        if (maas < 1000) deathCount += 15;
        else if (maas <= 2000) deathCount += 5;
        return deathCount;
    }
}
