package Call_by_value_Refference;

public class value {
    
    private static void change(int i){
        System.out.println("Before Change = "+i);
        i = 20;
        System.out.println("After Change = "+i);
    }
    
    public static void main(String[] args){
        int x = 10;
        
        change(x);
    }
}
