package StudentManagementSystem;


import StudentManagementSystem.exception.StudentNotFoundException;
import StudentManagementSystem.model.Student;
import StudentManagementSystem.service.StudentService;
import StudentManagementSystem.util.InputUtil;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");


            choice = InputUtil.sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter ID");
                        int id = InputUtil.sc.nextInt();

                        System.out.println("Enter Name");
                        String name = InputUtil.sc.next();

                        System.out.println("Enter Marks");
                        int marks = InputUtil.sc.nextInt();

                        Student s = new Student(id, name, marks);
                        service.addStudent(s);
                        break;

                    case 2:
                        service.viewStudents();
                        break;

                    case 3:
                        System.out.println("Enter ID");
                        int searchID = InputUtil.sc.nextInt();
                        service.findStudent(searchID).showStudent();
                        break;

                    case 4:
                        System.out.println("Enter ID");
                        int updatedId = InputUtil.sc.nextInt();

                        System.out.println("Enter New Marks");
                        int newMarks = InputUtil.sc.nextInt();

                        service.updateMarks(updatedId, newMarks);
                        break;

                    case 5:
                        System.out.println("Enter ID: ");
                        int deletedId = InputUtil.sc.nextInt();
                        service.deleteStudent(deletedId);
                        break;

                    case 6:
                        System.out.println("Existing... Thank you!");
                        break;

                    default:
                }
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Try again. ");
                InputUtil.sc.nextInt();//clear buffer
            }

            }
            while (choice != 6) ;
        }
    }


