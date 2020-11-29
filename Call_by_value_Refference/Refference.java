package Call_by_value_Refference;

public class Refference {
    private static String change(String b){
        b = "Pori";
        return b;
    }
    
    public static void main(String[] args){
        String a = "Marjuk";
        
        System.out.println("Before Name: "+a);
        String c = change(a);
        
        System.out.println("After Name: "+c);
    }
}
