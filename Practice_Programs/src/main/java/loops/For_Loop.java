package loops;

public class For_Loop {
    public void PrintTable(int input){
        for(int i=1; i<=10;i++){
            System.out.println(input  + " * " +  i + " = " + i*input);
        }
    }

    public static void main(String[] args) {
        For_Loop obj=new For_Loop();
        obj.PrintTable(5);
    }
}
