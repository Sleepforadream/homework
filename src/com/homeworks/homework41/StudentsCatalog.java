package com.homeworks.homework41;

import java.util.ArrayList;
import java.util.Collections;

public class StudentsCatalog<E extends Students> {

    protected ArrayList<Students> studentsArrayList = new ArrayList<Students>();

    @Override
    public String toString() {
        return studentsArrayList + "";
    }

    public StudentsCatalog() {
        this.studentsArrayList = getStudentsCatalog();
    }

    public ArrayList<Students> getStudentsCatalog() {

        Students[] students = Students.values();
        ArrayList<Students> studentsCatalog = new ArrayList<Students>();

        Collections.addAll(studentsCatalog, students);

        return studentsCatalog;
    }
}
