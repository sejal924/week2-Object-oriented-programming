package com.hierarchicalinheritance.schoolsystem;

public class SchoolSystem{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Ram Tiwari", 21, "Java");
        teacher.displayRole();

        Student student=new Student("Neha Yadav", 20, "A");
        student.displayRole();

        Staff staff=new Staff("Anju Verma", 20, 100000);
        staff.displayRole();

    }
}
