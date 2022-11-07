package conditional_handling;
//AND-OR operator conditional handling
public class D {
/*    public void compareNumber(int input){
        //Using AND operator
        if(input >=0 && input<=100){
            System.out.println("This is a small number");
        }else {
            System.out.println("This is a large number");
        } //to comment block of code ctrl+shift+ /
    }*/
    public void compareNumber(int input){
        //Using OR operator
        if (input < 0 || input >100){
            System.out.println("Number is invalid");
        }else {
            System.out.println("Number is valid");
        }
    }
    public static void main(String[] args) {
        D obj=new D();
        obj.compareNumber(99);
    }
}
