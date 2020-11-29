package method_overloading;

public class main {
    
    public static void main(String[] args){
        int a=2,b=5,c=6;
        double d=5.5,e=7.7;
     
        main ob = new main();
        
        ob.add(a,b);
        ob.add(a,b,c);
        ob.add(d,e);
        ob.add();
        
    }
    
    
    void add(int a,int b){
        System.out.println("\nSum int no: "+a+" + "+b+" = "+(a+b));
    }
    
    void add(double a,double b){
        System.out.println("\nSum double no: "+a+" + "+b+" = "+(a+b));
    }
    
    void add(int a,int b,int c){
        System.out.println("\nSum int no: "+a+" + "+b+" + "+c+" = "+(a+b+c));
    }
    
    void add(){
        System.out.println("\nNothing to add....!!");
    }
    
}
