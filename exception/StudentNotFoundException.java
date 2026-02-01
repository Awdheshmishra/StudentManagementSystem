package StudentManagementSystem.exception;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message){
        super(message);
    }
}
//ye wala exception handle karega with the help of super key