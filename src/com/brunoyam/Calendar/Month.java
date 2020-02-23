package com.brunoyam.Calendar;

public enum Month {
    JAN("январь", 1, 31, Season.WINTER),
    FEB("февраль", 2, 28, Season.WINTER),
    MAR("март", 3, 31, Season.SPRING),
    APR("апрель", 4, 30, Season.SPRING),
    MAY("май", 5, 31, Season.SPRING),
    JUN("июнь", 6, 30, Season.SUMMER),
    JUL("июль", 7, 31, Season.SUMMER),
    AUG("август", 8, 31, Season.SUMMER),
    SEP("сентябрь", 9, 30, Season.AUTUMN),
    OCT("октябрь", 10, 31, Season.AUTUMN),
    NOV("ноябрь", 11, 30, Season.AUTUMN),
    DEC("декабрь", 12, 31, Season.WINTER);


    private String name;
    private Integer position;
    private Integer daysNumber;
    private Season season;

    Month(String name, Integer position, Integer daysNumber, Season season) {
        this.name = name;
        this.position = position;
        this.daysNumber = daysNumber;
        this.season = season;
    }

    static Month getByPosition(Integer position) {
        Month[] months = values();

        for(Month month : months){
            if(month.getPosition().equals(position)) {
                return month;
            }
        }

        return null;
    }

    static Month getByDay(Integer day){

        Integer daysSum = 0;

        for(Month month : values()) {
            daysSum += month.getDaysNumber();
            if(daysSum >= day) {
                return month;
            }

        }

        return null;
    }

    public String getName() {
        return name;
    }

    public Season getSeason() {
        return season;
    }

    public Integer getPosition() {
        return position;
    }

    public Integer getDaysNumber() {
        return daysNumber;
    }
}
