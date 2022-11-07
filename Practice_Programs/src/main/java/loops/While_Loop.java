package loops;

public class While_Loop {
    public void PrintTable(int input){
        int i=1;
        while(i<=10){
            System.out.println(input + " * " + i + " = " + input*i);
            i++;
        }
    }

    public static void main(String[] args) {
        While_Loop obj=new While_Loop();
        obj.PrintTable(10);
    }
}
