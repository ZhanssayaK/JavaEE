package problem6.db;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<Student> student = new ArrayList<>();

    public static void addStudent(Student s){
        student.add(s);
    }
    public static ArrayList<Student> getStudent(){
        return student;
    }
}
