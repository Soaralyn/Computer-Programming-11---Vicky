//import java libraries
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //create a school
        School mySchool = new School();
        //add 10 students
        mySchool.addStudent("Olivia", "Brown", "1");
        mySchool.addStudent("Amelia", "Smith", "2");
        mySchool.addStudent("Emma", "Johnson", "3");
        mySchool.addStudent("Elijah", "Williams", "4");
        mySchool.addStudent("Liam", "Jones", "5");
        mySchool.addStudent("Ava", "Miller", "6");
        mySchool.addStudent("Noah", "Davis", "7");
        mySchool.addStudent("Lucas", "Rodriguez", "8");
        mySchool.addStudent("Charlotte", "Wilson", "9");
        mySchool.addStudent("Levi", "Anderson", "10");

        //add 2 teachers
        mySchool.addTeacher("Isabella", "Thomas", "English");
        mySchool.addTeacher("James", "Taylor", "Math");

        //Code check getArrTeachers & all related methods in Teacher class
        /*ArrayList <Teacher> myTeacherList = mySchool.getArrTeachers();
        System.out.println(myTeacherList.get(0).getTeacherFirstName());
        System.out.println(myTeacherList.get(1).getTeacherLastName());
        System.out.println(myTeacherList.get(0).getTeacherSubject());
        myTeacherList.get(1).teacherPrint();

        myTeacherList.get(0).setTeacherFirstName("Izzy");
        myTeacherList.get(0).teacherPrint();
        myTeacherList.get(1).setTeacherLastName("Moore");
        myTeacherList.get(1).teacherPrint();

        //Code check getArrStudents & all related methods in Student class
        ArrayList <Student> myStudentList = mySchool.getArrStudents();
        System.out.println(myStudentList.get(0).getStudentFirstName());
        System.out.println(myStudentList.get(3).getStudentLastName());
        System.out.println(myStudentList.get(5).getStudentGrade());
        System.out.println(myStudentList.get(7).getStudentNumber());
        myStudentList.get(4).studentPrint();

        myStudentList.get(1).setStudentGrade("3");
        myStudentList.get(1).studentPrint();
        myStudentList.get(3).setStudentFirstName("Eli");
        myStudentList.get(3).studentPrint();
        myStudentList.get(5).setStudentLastName("Jackson");
        myStudentList.get(5).studentPrint();

        //Code check getArrCourses & all related methods in Courses class
        ArrayList <String> myCourseList = mySchool.getArrCourses();
        System.out.println(myCourseList.toString());*/

        //list everything
        mySchool.listAllStudents();
        mySchool.listAllTeachers();
        mySchool.listAllCourses();

        //delete 2 students
        mySchool.deleteStudent("Emma", "Johnson");
        mySchool.deleteStudent("Lucas", "Rodriguez");

        //delete 1 teacher
        mySchool.deleteTeacher("James", "Taylor");

        //list everything
        mySchool.listAllStudents();
        mySchool.listAllTeachers();
        mySchool.listAllCourses();
    }
}