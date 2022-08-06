package com.homeworks.homework41;

public abstract class Courses {

    private final Integer durationHrs;

    public Integer getDurationHrs() {
        return durationHrs;
    }

    public Courses(Integer durationHrs) {
        this.durationHrs = durationHrs;
    }
}
