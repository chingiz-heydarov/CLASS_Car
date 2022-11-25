package com.noyabr23;

class AA extends Human implements BadHabit, Routine, Fat {
    int staj;
    boolean lexusLX570;
    boolean personalRoom;
    boolean reis;
    boolean bagBilge;

    AA(int age, String name, int deathCount, int staj, boolean lexusLX570, boolean personalRoom, boolean reis, boolean bagBilge) {
        this.age = age;
        this.staj = staj;
        this.lexusLX570 = lexusLX570;
        this.personalRoom = personalRoom;
        this.reis = reis;
        this.bagBilge = bagBilge;
        this.deathCount=deathCount;
        this.name=name;
    }

    @Override
    public int movingless() {
        deathCount += 50;
        return deathCount;
    }

    @Override
    public int smoking() {
        deathCount += 35;
        return deathCount;
    }

    @Override
    public int alchogolyzm() {
        deathCount += 15;
        return deathCount;
    }

    @Override
    public int stress() {
        if (lexusLX570) deathCount -= 10;
        if (personalRoom) deathCount -= 10;
        if (reis) deathCount -= 15;
        if (bagBilge) deathCount -= 20;
        deathCount -= staj;
        return deathCount;
    }

}
