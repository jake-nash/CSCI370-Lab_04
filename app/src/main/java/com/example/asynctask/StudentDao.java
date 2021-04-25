package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {
    private ArrayList<Student> studentArrayList =  new ArrayList<>();

    public StudentDao() {
        Student s1 = new Student("Shmoe", "Joe", "Music");
        Student s2 = new Student("Bob", "Billy", "Agriculture");
        Student s3 = new Student("Montana", "Hannah", "PolySci");
        Student s4 = new Student("Nash", "Jacob", "Computer science");
        Student s5 = new Student("Kong", "King", "Philosophy");
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
    }

    ArrayList<Student> getAllStudents() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentArrayList;
    }
}
