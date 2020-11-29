package OOP_1;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st Teacher's information: \nEnter name: ");
        String name1 = input.nextLine();
        System.out.print("Enter age: ");
        int age1 = input.nextInt();
        System.out.print("Enter gender: ");
        String gender1 = input.next();
        System.out.print("Enter phn: ");
        String phn1 = input.next();
        
        Teacher teacher1 = new Teacher(name1,age1,gender1,phn1);
        
        
        
        System.out.print("\n\nEnter 2nd Teacher's information: \nEnter name: ");
        String name2 = input.next();
        System.out.print("Enter age: ");
        int age2 = input.nextInt();
        System.out.print("Enter gender: ");
        String gender2 = input.next();
        System.out.print("Enter phn: ");
        String phn2 = input.next();
        
        Teacher teacher2 = new Teacher(name2,age2,gender2,phn2);
        
        
        
        
        System.out.print("\n\nEnter 3rd Teacher's information: \nEnter name: ");
        String name3 = input.next();
        System.out.print("Enter age: ");
        int age3 = input.nextInt();
        System.out.print("Enter gender: ");
        String gender3 = input.next();
        
        Teacher teacher3 = new Teacher(name3,age3,gender3);
        
        
        
        
        System.out.println("\n\n❤ ❤ 1st Teacher:");
        teacher1.display();
        
        System.out.println("\n\n❤ ❤ 2nd Teacher:");
        teacher2.display();
        
        System.out.println("\n\n❤ ❤ 3rd Teacher: ");
        teacher3.display();
        
        System.out.println("\n\n❤ ❤ 4th Teacher 😍");
        Teacher teacher4 = new Teacher();
        teacher4.display();
        
    }   
}