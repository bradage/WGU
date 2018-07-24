package sample;

public class Main{

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
        Roster.print_average_grade("2");

        //Calling remove from Roster
        Roster.remove("2");
//        Roster.remove("3");





    }
}
