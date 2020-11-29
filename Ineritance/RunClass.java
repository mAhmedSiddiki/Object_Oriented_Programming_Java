package Ineritance;

import java.util.*;

public class RunClass {

    private static Object in;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        SubClass1 j = new SubClass1();
        SubClass2 k = new SubClass2();
        
        System.out.print("Just enter the J and K section: ");
        char sec = input.next().charAt(0);
        
        switch(sec){
            case 'J':
                System.out.print("Enter your name: ");
                input.nextLine();
                String name1 = input.nextLine();
                System.out.print("Enter your id: ");
                String id1 = input.next();
                System.out.print("Enter your gender: ");
                String gender1 = input.next();
                System.out.print("Enter your age: ");
                int age1 = input.nextInt();
                j.name = name1;
                j.gender = gender1;
                j.id = id1;
                j.age = age1;
                System.out.println("\n");
                j.display2();
                break;
            
            case 'K':
                System.out.print("Enter your name: ");
                input.nextLine();
                String name2 = input.nextLine();
                System.out.print("Enter your id: ");
                String id2 = input.next();
                System.out.print("Enter your gender: ");
                String gender2 = input.next();
                System.out.print("Enter your age: ");
                int age2 = input.nextInt();
                k.name = name2;
                k.gender = gender2;
                k.id = id2;
                k.age = age2;
                k.display3();
                break;
                
            default:
                System.out.println("You are not eligible for this session....!!!!!");
        }
    }
}
