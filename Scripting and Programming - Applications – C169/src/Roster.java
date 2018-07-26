import java.util.ArrayList;

public class Roster {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args){

        //Entering Table data
        Roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88,79,59);
        Roster.add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19,91,72,85);
        Roster.add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19,85,84,87);
        Roster.add("4", "Erin", "Balck", "Erin.black@comcast.net", 22, 91,98,82);
        Roster.add("5", "Bradey", "Merrill", "bmerri3@wgu.edu", 33, 85,90,95);

        //Calling printAll method from Roster
        Roster.print_all();

        //Calling print_invalid_emails() from Roster
        Roster.print_invalid_emails();

        //Loop through the ArrayList and for each element:

        //Calling print_average_grade from Roster
        for(int i = 0 ; i < students.size(); i++) {
            String studentID = students.get(i).getStudentId();
            Roster.print_average_grade(studentID);
        }

        //Calling remove from Roster
        Roster.remove("3");
        Roster.remove("3");

    }

    public static void add(String studentId, String firstName, String lastName, String eMail, int age, int grade1, int grade2, int grade3){

        int[] grades = {grade1, grade2, grade3};//create array from input
        Student newStudent = new Student(studentId, firstName, lastName, eMail, age, grades);//student now created
        students.add(newStudent);
    }

    public static void remove(String studentID){
        //Loop through students
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStudentId().equals(studentID)){
                System.out.println("Removing studentID:\t" + studentID);
                students.remove(i);
                return;
            }
        }
        System.out.println("No student found with student ID Of " + studentID);

    }

    public static void print_all(){
        //loop through the students arraylist
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
            if(!s.geteMail().contains("@") || !s.geteMail().contains(".") || s.geteMail().contains(" ")) {
                System.out.println("Invalid Emails for StudentID:\t" + s.getStudentId() + " email is entered as:\t" + s.geteMail());
            }
        }

    }
}
