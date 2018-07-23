package sample;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String eMail;
    private int age;
    private int[] grades;


    public Student(int studentId, String firstName, String lastName, String eMail, int age, int[] grades) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.age = age;
        this.grades = grades;
    }

    public String print(String printString){
        return printString;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
