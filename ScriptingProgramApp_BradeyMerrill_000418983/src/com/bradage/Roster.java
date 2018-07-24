package com.bradage;

import java.util.ArrayList;
import java.util.List;

public class Roster {
    private ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }
}
