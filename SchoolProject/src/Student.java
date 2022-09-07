//create fields
public class Student {
    private String studentFirstName;
    private String studentLastName;
    //I used string for studentGrade because string can include K, Pre-K, etc, and we don't need to add/subtract the grade.
    private String studentGrade;
    private int studentNumber;

    //constructor
    public Student(String studentFirstName, String studentLastName, String studentGrade, int studentNumber) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGrade = studentGrade;
        this.studentNumber = studentNumber;
    }

    //Getter for studentFirstName
    public String getStudentFirstName() {
        return studentFirstName;
    }
    //Setter for studentFirstName
    public void setStudentFirstName(String newStudentFirstName) {
        this.studentFirstName = newStudentFirstName;
    }
    //Getter for studentLastName
    public String getStudentLastName() {
        return studentLastName;
    }
    //Setter for studentLastName
    public void setStudentLastName(String newStudentLastName) {
        this.studentLastName = newStudentLastName;
    }
    //Getter for studentGrade
    public String getStudentGrade() {
        return studentGrade;
    }
    //Setter for studentGrade
    public void setStudentGrade(String newStudentGrade) {
        this.studentGrade = newStudentGrade;
    }
    //Getter for studentNumber
    public int getStudentNumber() {
        return studentNumber;
    }


    //print student information
    public void  studentPrint() {
        System.out.println("Name: " + studentFirstName + " " + studentLastName + "\nGrade: " + studentGrade);
    }
}
