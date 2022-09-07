//create fields
public class Teacher {
    private String teacherFirstName;
    private String teacherLastName;
    private String teacherSubject;

    //constructor
    public Teacher(String teacherFirstName, String teacherLastName, String teacherSubject) {
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.teacherSubject= teacherSubject;
    }

    //Getter for teacherFirstName
    public String getTeacherFirstName() {
        return teacherFirstName;
    }
    //Setter for teacherFirstName
    public void setTeacherFirstName(String newTeacherFirstName) {
        this.teacherFirstName = newTeacherFirstName;
    }
    //Getter for teacherLastName
    public String getTeacherLastName() {
        return teacherLastName;
    }
    //Setter for teacherLastName
    public void setTeacherLastName(String newTeacherLastName) {
        this.teacherLastName = newTeacherLastName;
    }
    //Getter for teacherSubject
    public String getTeacherSubject() {
        return teacherSubject;
    }

    //print teacher information
    public void  teacherPrint() {
        System.out.println("Name: " + teacherFirstName + " " + teacherLastName + "\nSubject: " + teacherSubject);
    }
}


