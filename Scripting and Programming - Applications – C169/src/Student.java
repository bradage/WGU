public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String eMail;
    private int age;
    private int[] grades;


    //Constructor
    public Student(String studentId, String firstName, String lastName, String eMail, int age, int[] grades) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        seteMail(eMail);
        setAge(age);
        setGrades(grades);
    }

    //Getters
    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return grades;
    }

    //Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    //Methods
    public void print(){
        System.out.println("StudentID:\t" + getStudentId()+
                "\tFirst Name:\t" + getFirstName()+
                "\tLast Name:\t" + getLastName()+
                "\tE-mail:\t" + geteMail()+
                "\tAge:\t" + getAge());
    }

}
