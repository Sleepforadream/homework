package com.homeworks.homework41;

import java.time.*;
import java.util.ArrayList;

import static com.homeworks.homework41.Students.*;

public class TrainingCenter {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.of(IvanovIvan.getStartDate(), LocalTime.of(10, 0)));

        System.out.println(LocalDateTime.of(IvanovIvan.getStartDate(), LocalTime.of(10, 0)).plusHours(24));

        ArrayList<Students> dsaf = new ArrayList<Students>();

        StudentsCatalog<Students> ads = new StudentsCatalog<>();

        System.out.println(ads);

    }
}
