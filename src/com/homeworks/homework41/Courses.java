package com.homeworks.homework41;

public enum Courses {

    javaServlets(16),
    strutsFramework(24),
    technologiesJava(8),
    JFCSwing(16),
    JDBC(16);

    private final long durationHrs;

    Courses(long durationHrs) {
        this.durationHrs = durationHrs;
    }

    public long getDurationHrs() {
        return durationHrs;
    }
}