package conditional_handling;
//This is if-else if-else example
public class C {
    public void checkIfElse(int input){
        if(input<0){
            System.out.println("Number is negative");
        } else if (input==0) {
            System.out.println("Number is Null");
        } else if (input%2==0) {
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
       C obj=new C();
       obj.checkIfElse(-45);
    }
}
