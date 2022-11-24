package com.noyabr23;

class Minor extends Office implements Goodhabit {
    Minor(int age, int deathCount, int maas, boolean holiday, int workhours) {
        this.age = age;
        this.maas = maas;
        this.holiday = holiday;
        this.workhours = workhours;
        this.deathCount=deathCount;
    }

    @Override
    public int stress() {
        if (!holiday) deathCount += 10;
        deathCount+= workhours-40;
        if (maas < 1000) deathCount += 15;
        else if (maas <= 2000) deathCount += 5;
        return deathCount;
    }

    @Override
    public int movingless() {
        deathCount += 40;
        return deathCount;
    }

    @Override
    public int workout() {
        deathCount -= 35;
        return deathCount;
    }

    @Override
    public int regularSex() {
        deathCount -= 30;
        return deathCount;
    }
}