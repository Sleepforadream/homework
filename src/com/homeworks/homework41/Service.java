package com.homeworks.homework41;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.time.LocalDateTime.*;

public class Service <T extends Students> {

    boolean getOverLearning (Students student){
        LocalDateTime startDateTime = of(student.getStartDate(), LocalTime.of(10,0));
        if (startDateTime.plusHours(getLearningHours(student)) > now()) {

        }
        return false;
    }



    public long getLearningHours(Students student) {
        long learningHours = 0;
        for (int i = 0; i < student.getCourse().length; i++) {
            learningHours = learningHours + (student.getCourse()[i].getDurationHrs());
        }
        return learningHours;
    }
}
