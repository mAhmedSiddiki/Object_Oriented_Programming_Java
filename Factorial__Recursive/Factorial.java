package Factorial__Recursive;

import java.util.Scanner;

public class Factorial {
    
    int fact(int i){
        if(i==1){
            return 1;
        }
        else{
            return i*fact(i-1);
        }
    }
    
    public static void main(String[] args){
        
        Factorial a = new Factorial();
        
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        int y = a.fact(x);
        
        System.out.println("Factorial of "+x+" = "+y);
    }
}