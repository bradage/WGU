package sample;

import java.util.ArrayList;

public class Roster {

    static ArrayList<Student> students = new ArrayList<>();

    public static void add(String studentId, String firstName, String lastName, String eMail, int age, int grade1, int grade2, int grade3){

        int[] grades = {grade1, grade2, grade3};//create array from input
        Student newStudent = new Student(studentId, firstName, lastName, eMail, age, grades);//student now created
        students.add(newStudent);
    }

    public static void remove(String studentID){
        //Loop through students
        for(Student s : students){
            if(s.getStudentId().equals(studentID)){
                System.out.println("Removing studentID:\t" + studentID);
                students.remove(s);
                return;
            } else
                System.out.println("No such student with studentID of " + studentID);
                return;
        }
    }

    public static void print_all(){
        //loop thorugh the students arraylist
        for(int i = 0; i < students.size(); i++){
            //get each student and call the print method from the student class
            students.get(i).print();
        }

    }

    public static void print_average_grade(String studentID){
        //loop through the students ArrayList with an enhanced for loop
        for(Student s : students){
            if(s.getStudentId().equals(studentID)) {
                //calculate the average
                double average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
                System.out.println("StudentID:\t" + s.getStudentId() + "\tAverage grade is:\t" + average);
            }
        }
    }

    public static void print_invalid_emails(){
        for(Student s : students){
            if(!s.geteMail().contains("@")){
                System.out.println("Invalid Emails for StudentID:\t" + s.getStudentId() + " email is entered as:\t" + s.geteMail());
            } else if(!s.geteMail().contains(".")){
                System.out.println("Invalid Emails for StudentID:\t" + s.getStudentId() + " email is entered as:\t" + s.geteMail());
            } else if(s.geteMail().contains(" ")){
                System.out.println("Invalid Emails for StudentID:\t" + s.getStudentId() + " email is entered as:\t" + s.geteMail());
            }
        }

    }
}
