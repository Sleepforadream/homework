package com.homeworks.homework41;

import java.time.LocalDate;

import static com.homeworks.homework41.Courses.*;

public enum Students {
    IvanovIvan("J2EE Developer", LocalDate.of(2022, 8, 5), javaServlets, strutsFramework),
    PetrovPetr("Java Developer", LocalDate.of(2022, 8, 5), technologiesJava, JFCSwing, JDBC);

    private final String curriculum;

    private final LocalDate StartDate;

    private final Courses[] Course;

    Students(String curriculum, LocalDate startDate, Courses... course) {
        this.curriculum = curriculum;
        StartDate = startDate;
        Course = course;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public Courses[] getCourse() {return Course;}
}