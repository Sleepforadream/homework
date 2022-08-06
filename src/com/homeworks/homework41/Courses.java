package com.homeworks.homework41;

import java.time.LocalTime;

public abstract class Courses {

    private final long durationHrs;

    public long getDurationHrs() {
        return durationHrs;
    }

    public Courses(long durationHrs) {
        this.durationHrs = durationHrs;
    }
}
