package Method_Overriding;

public class RunClass {
    public static void main(String[] args){
        Teacher ob = new Teacher();
        
        ob.name = "Marjuk AHmed Siddiki";
        ob.age = 23;
        ob.qualification = "Bsc in CSE";
        
        ob.display();
        
        Person ob1 = new Person();
        
        ob1.name = "Ayatullah All Ahmed Siddiki";
        ob1.age = 15;
        
        ob1.display();
    }
}
