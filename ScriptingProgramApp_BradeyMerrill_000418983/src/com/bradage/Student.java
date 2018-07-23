package com.bradage;

import java.util.Scanner;

public class Student {


    Scanner scanner = new Scanner(System.in);

    private int StudentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    public Student(int studentID, String firstName, String lastName, String email, int age, int[] grades) {
        StudentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentId) {
        StudentID = studentId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void print(){

        boolean quit = false;

        while(!quit) {
            printOptions();
            int printInput = scanner.nextInt();

            switch (printInput) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Printing StudentID: " + getStudentID());
                    break;
                case 2:
                    System.out.println("Printing First Name: " + getFirstName());
                    break;
                case 3:
                    System.out.println("Printing Last Name: " + getLastName());
                    break;
                case 4:
                    System.out.println("Printing E-mail: " + getEmail());
                    break;
                case 5:
                    System.out.println("Printing Age: " + getAge());
                    break;
                case 6:
                    printOptions();
                    break;
                default:
                    System.out.println("Invalid entry.  please follow these instructions:\n");
                    printOptions();
            }
        }


        }


     private static void printOptions(){
         System.out.println("Please choose an item to print. (Enter 6 to see this menu again)\n" +
                 "Enter 0 to close\n" +
                 "Enter 1 for StudentID\n" +
                 "Enter 2 for First Name\n" +
                 "Enter 3 for Last Name\n" +
                 "Enter 4 for E-mail\n" +
                 "Enter 5 for Age\n");
     }



    }

