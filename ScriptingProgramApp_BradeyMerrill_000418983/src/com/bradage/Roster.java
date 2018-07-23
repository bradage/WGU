package com.bradage;

import java.util.ArrayList;
import java.util.List;

public class Roster {
    List<Student> students = new ArrayList<Student>();
    Student student = new Student(1, "John", "Smith", "John1989@gmail.com", 20, new int[] {88,79,59});

    public static void remove(String studentID){
        System.out.println("Enter the StudentID you wish to remove.");

    }

    public Student  queryStudent(int studentID){
        int position = findStudent(studentID);
        if(position >= 0){
            return this.student.get(position);
        }
        return null;
    }

    private int findStudent(int studentID){
        for(int i = 0; i < this.students.size(); i++){
            Student student = this.students.get(i);
            if(student.getStudentID().equals(studentID)){
                return i;
            }
        }
    }

}
