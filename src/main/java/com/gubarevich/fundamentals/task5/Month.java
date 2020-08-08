package com.gubarevich.fundamentals.task5;

import java.util.HashMap;
import java.util.Map;

public enum Month {
    January("January", 1),
    February("February", 2),
    March("March", 3),
    April("April", 4),
    May("May", 5),
    June("June", 6),
    July("July", 7),
    August("August", 8),
    October("October", 9),
    September("September", 10),
    November("November", 11),
    December("December", 12);


    private String name;
    private int number;
    private static final Map<Integer, Month> monthesMap = new HashMap<Integer, Month>();

    static {
        for (Month month : Month.values()) {
            monthesMap.put(month.getNumber(), month);
        }
    }

    Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static Month get(int number) {
        return monthesMap.get(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
