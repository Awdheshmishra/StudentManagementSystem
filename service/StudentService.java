package StudentManagementSystem.service;

import StudentManagementSystem.exception.StudentNotFoundException;
import StudentManagementSystem.model.Student;

import java.util.ArrayList;

// import model.Student;
// import exception.StudentNotFoundException;
public class StudentService {

    //collection framework

    private ArrayList<Student> students = new ArrayList<>();

    //add student

    public void addStudent(Student s){
        students.add(s);
        System.out.println("students added successfully");
    }

    //view all student

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("no student available");
            return;
        }

        //java 8 lambda

        students.forEach(st -> st.showStudent());
    }
    //find student by ID

    public Student findStudent(int id) throws StudentNotFoundException{
        for (Student s: students){
            if(s.getId() == id){
                return s;
            }
        }

        //throws custom exception

        throw  new StudentNotFoundException(
                "Student with ID "+ " not found "
        );
    }

    //update marks

    public void updateMarks(int id, int newMarks)
        throws StudentNotFoundException{

        Student s = findStudent(id);
        s.setMarks(newMarks);
        System.out.println("marks updated successfully");
    }

    //delete student

    public void  deleteStudent(int id) throws  StudentNotFoundException{
        Student s = findStudent(id);
        students.remove(s);
        System.out.println("student deleted successfully");
    }
}
