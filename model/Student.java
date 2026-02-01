package StudentManagementSystem.model;

public class Student {
    private int id;
    private String name;
    private int marks;


    // constructor

    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //getters

    public int getId(){
        return  id;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    // setter

    public void setMarks(int marks){
        this.marks = marks;
    }

    //method to display Student

    public void showStudent(){
        System.out.println(id +" | "+ name+" | "+ marks);
    }

}
