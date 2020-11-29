package Cheak_Inheritence_Instance;

public class Cheak {
    public static void main(String[] args){
        
        Animal a = new Animal();
        Teacher t = new Teacher();
        Person p = new Person();
        Student s = new Student();
        
        System.out.println(t instanceof Animal );
        System.out.println(p instanceof Teacher);
        System.out.println(s instanceof Animal);
        System.out.println(t instanceof Student);
        System.out.println(t instanceof Person);
    
    }
}
