//import java libraries
import java.util.ArrayList;
public class School {
    //create fields
    ArrayList<Teacher> arrTeachers;
    ArrayList<Student> arrStudents;
    ArrayList<String> arrCourses;

    //constructor
    public School() {
        this.arrTeachers = new ArrayList<>();
        this.arrStudents = new ArrayList<>();
        this.arrCourses = new ArrayList<>();
    }
    //setters & getters
    public ArrayList<Teacher> getArrTeachers() {
        return arrTeachers;
    }

    public void setArrTeachers(ArrayList newArrTeachers) {
        this.arrTeachers = newArrTeachers;
    }

    public ArrayList getArrStudents() {
        return arrStudents;
    }

    public void setArrStudents(ArrayList newArrStudents) {
        this.arrStudents = newArrStudents;
    }

    public ArrayList getArrCourses() {
        return arrCourses;
    }

    public void setArrCourses(ArrayList newArrCourses) {
        this.arrCourses = newArrCourses;
    }

    //method for adding a teacher to list
    public void addTeacher(String teacherFirstName, String teacherLastName, String teacherSubject) {
        Teacher newTeacher = new Teacher(teacherFirstName, teacherLastName, teacherSubject);
        arrTeachers.add(newTeacher);
        if (!arrCourses.contains(teacherSubject)) {
            arrCourses.add(teacherSubject);
        }
    }

    //method for adding a student to list
    public void addStudent(String studentFirstName, String studentLastName, String studentGrade) {
        int studentNumber = arrStudents.size()+1;
        Student newStudent = new Student(studentFirstName, studentLastName, studentGrade, studentNumber);
        arrStudents.add(newStudent);
    }

    //method for deleting a teacher from list
    public void deleteTeacher(String teacherFirstName, String teacherLastName) {
        String subject = "";
        for (int i = 0; i < arrTeachers.toArray().length; i++)
            if((teacherFirstName.equals(arrTeachers.get(i).getTeacherFirstName())) && (teacherLastName.equals(arrTeachers.get(i).getTeacherLastName()))) {
                subject = arrTeachers.get(i).getTeacherSubject();
                arrTeachers.remove(i);
            }
        for (int i = 0; i < arrTeachers.toArray().length; i++) {
            if (arrTeachers.get(i).getTeacherSubject().equals(subject)) {
                break;
            }
            arrCourses.remove(subject);
        }
    }

    //method for deleting a student from list
    public void deleteStudent(String studentFirstName, String studentLastName) {
        for (int i = 0; i < arrStudents.toArray().length; i++)
            if((studentFirstName.equals(arrStudents.get(i).getStudentFirstName())) && (studentLastName.equals(arrStudents.get(i).getStudentLastName()))) {
                arrStudents.remove(i);
            }
    }

    //method to show all teachers
    public void listAllTeachers() {
        System.out.println("************************Teachers************************");
        for (int i = 0; i < arrTeachers.toArray().length; i++)
            System.out.println("#" + Integer.toString(i+1) + "\tName: " + arrTeachers.get(i).getTeacherFirstName() + " " + arrTeachers.get(i).getTeacherLastName() + "\tSubject: " + arrTeachers.get(i).getTeacherSubject());
    }

    //method to show all students
    public void listAllStudents() {
        System.out.println("************************Students************************");
        for (int i = 0; i < arrStudents.toArray().length; i++)
            System.out.println("#" + Integer.toString(i+1) + "\tName: " + arrStudents.get(i).getStudentFirstName() + " " + arrStudents.get(i).getStudentLastName() + "\tGrade: " + arrStudents.get(i).getStudentGrade() + "\tStudent Number: " + arrStudents.get(i).getStudentNumber());
    }

    //method to list all courses
    public void listAllCourses() {
        System.out.println("************************Courses************************");
        for (int i = 0; i < arrCourses.toArray().length; i++)
            System.out.println("#" + Integer.toString(i+1) + "\tCourse Name: " + arrCourses.get(i));
    }
}
