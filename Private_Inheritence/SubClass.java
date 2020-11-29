package Private_Inheritence;

public class SubClass extends SupperClass{
    private String Program;

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }
    
    
    void display(){
        display1();
        System.out.println("Program: "+getProgram());
    }
}
