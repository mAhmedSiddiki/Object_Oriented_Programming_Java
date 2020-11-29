package Ineritance;

public class SubClass2 extends SupperClass{
    String gender;
    int age;
    
    void display3(){
        display1();
        System.out.println("Section: K");
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}
