package Super_Keyword_Method_Overriding;


public class B extends A{
    @Override
    void display(){
        super.display();
        System.out.println("Inside B class");
    }
}
