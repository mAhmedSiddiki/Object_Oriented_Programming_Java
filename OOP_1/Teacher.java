package OOP_1;

public class Teacher {
    
    String name,gender,phn;
    int age;
    
    Teacher(){
        System.out.println("NO Data");
    }
    
    Teacher(String e,int f,String g){
        name = e;
        age = f;
        gender = g; 
    }
    
    Teacher(String a,int b,String c,String d){
        name = a;
        age = b;
        gender = c;
        phn = d;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phn);
    }
    
}
