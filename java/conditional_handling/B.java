package conditional_handling;
//This is if-else
public class B {
    public void checkIfElse(int input){
        if (input%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("This is odd number");
        }
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.checkIfElse(23);
    }
}
