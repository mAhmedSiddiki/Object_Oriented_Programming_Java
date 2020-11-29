package Ineritance;

public class SubClass1 extends SupperClass{
    String gender;
    int age;
    
    void display2(){
        display1();
        System.out.println("Section: J");
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
