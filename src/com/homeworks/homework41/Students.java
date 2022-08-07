package com.homeworks.homework41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static com.homeworks.homework41.CoursesCatalog.*;

public enum Students {
    IvanovIvan("J2EE Developer", LocalDate.of(2022, 8, 2), javaServlets, strutsFramework),
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

    public Courses[] getCourse() {
        return Course;
    }

    public String getOverLearning (){
        LocalTime startTime = LocalTime.of(10,0);
        LocalDate startDate = getStartDate();

        //LocalDateTime startDateTime = of(getStartDate(), LocalTime.of(10,0));

        LocalTime timeNow = LocalTime.now();
        LocalDate dateNow = LocalDate.now();
        long fullDays = getLearningHours() / 8;
        long remainderHours = getLearningHours() % 8;

        LocalTime timeOver = startTime.plusHours(remainderHours);
        LocalDate dateOver = startDate.plusDays(fullDays);

        LocalTime hoursHavePassed = timeOver.minusHours(LocalTime.now().getHour());
        LocalDate daysHavePassed = dateOver.minusDays(LocalDate.now().getDayOfMonth());

        LocalTime hoursLeft = LocalTime.now().minusHours(timeOver.getHour());
        LocalDate daysLeft = LocalDate.now().minusDays(dateOver.getDayOfMonth());

        if (LocalDateTime.of(dateOver, timeOver).compareTo(LocalDateTime.now())  < 0) {
            return "Обучение закончено. После окончания прошло " + (LocalTime.now().minusHours(timeOver.getHour()));
        }
        else {
            return "Обучение не закончено. До окончания " + (dateOver.minusDays(LocalDate.now().getDayOfMonth())) + " " + (timeOver.minusHours(LocalTime.now().getHour()));
        }
    }

    public long getLearningHours() {
        long learningHours = 0;
        for (int i = 0; i < getCourse().length; i++) {
            learningHours = learningHours + (getCourse()[i].getDurationHrs());
        }
        return learningHours;
    }

}