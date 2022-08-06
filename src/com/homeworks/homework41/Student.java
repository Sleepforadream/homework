package com.homeworks.homework41;

import java.time.*;

public abstract class Student {

    private final String curriculum;

    private final LocalDate StartDate;

    private final Courses[] Course;

    public Student(String curriculum, LocalDate startDate, Courses ... course) {
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

    public Courses[] getCourse() {
        return Course;
    }

    public Integer getLearningHours() {
        Integer count = 0;
        for (int i = 0; i < getCourse().length; i++) {
            count = getCourse()[i].getDurationHrs() + count;
        }
        return count;
    }
}
