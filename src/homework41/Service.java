package com.homeworks.homework41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Service {
    public static void getLearningStatus(Students student) {
        LocalTime startTime = LocalTime.of(10, 0);
        LocalDate startDate = student.getStartDate();

        long remainderHours = getLearningHours(student) % 8;
        long fullDays = getLearningHours(student) / 8;

        if (getLearningHours(student) % 8 == 0) {
            fullDays = (getLearningHours(student) / 8) - 1;
            remainderHours = 8;
        }

        LocalTime timeOver = startTime.plusHours(remainderHours);
        LocalDate dateOver = startDate.plusDays(fullDays);

        LocalTime hoursHavePassed = timeOver.minusHours(LocalTime.now().getHour());
        long daysHavePassed = (dateOver.toEpochDay() - (LocalDate.now().toEpochDay())) - 1;

        LocalTime hoursLeft = LocalTime.now().minusHours(timeOver.getHour());
        long daysLeft = (LocalDate.now().toEpochDay() - dateOver.toEpochDay());

        String formatHoursLeft = hoursLeft.format(DateTimeFormatter.ofPattern("H "));
        String formatHoursHavePassed = hoursHavePassed.format(DateTimeFormatter.ofPattern("H "));

        if (LocalDateTime.of(dateOver, timeOver).compareTo(LocalDateTime.now()) <= 0 && daysLeft != 0) {
            System.out.println("Обучение закончено. После окончания прошло " + daysLeft + " д" + " " + formatHoursLeft + "ч.");
        } else if (LocalDateTime.of(dateOver, timeOver).compareTo(LocalDateTime.now()) <= 0 && daysLeft == 0) {
            System.out.println("Обучение закончено. После окончания прошло " + formatHoursLeft + "ч.");
        } else if (LocalDateTime.of(dateOver, timeOver).compareTo(LocalDateTime.now()) > 0 && daysHavePassed != 0) {
            System.out.println("Обучение не закончено. До окончания " + daysHavePassed + " д" + " " + formatHoursHavePassed + "ч.");
        } else {
            System.out.println("Обучение не закончено. До окончания " + formatHoursHavePassed + "ч.");
        }
    }

    public static long getLearningHours(Students student) {
        long learningHours = 0;
        for (int i = 0; i < student.getCourse().length; i++) {
            learningHours = learningHours + (student.getCourse()[i].getDurationHrs());
        }
        return learningHours;
    }
}
