package com.noyabr23;

class Fehle extends Worker implements Doner, BadHabit {
    int workHour;
    boolean sigorta;
    boolean outside;

    Fehle(int age, String name, int deathCount, int workHour, boolean sigorta, boolean outside) {
        this.age = age;
        this.workHour = workHour;
        this.sigorta = sigorta;
        this.outside = outside;
        this.deathCount=deathCount;
        this.name=name;
    }

    @Override
    public int stress () {
        if (!sigorta) deathCount += 5;
        if (outside) deathCount += 25;
        deathCount *= workHour - 8;
        return deathCount;
    }

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
}
