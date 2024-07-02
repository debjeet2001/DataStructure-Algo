public class Student{
    private String name;
    private int age;
    private int regNumber;
    private String department;
    Student(String name, int regNumber, String department){
        this.name = name;
        this.regNumber = regNumber;
        this.department = department;
    }

    void setAge(int age){
        this.age = age;
    }
}