package com.noyabr23;

public abstract class Human {
    int age;
    int deathCount;
}

abstract class Worker extends Human implements Routine {
    int maas;
    boolean holiday;
}

abstract class Office extends Worker implements Fat {
    int workhours;
}



interface BadHabit {
    int alchogolyzm();

    int smoking();
}

interface Doner extends BadHabit {
    int FastFood();
}

interface Goodhabit {
    int workout();

    int regularSex();
}

interface Routine {
    int stress();
}

interface Fat {
    int movingless();
}
