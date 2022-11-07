package conditional_handling;
//if class check
public class A {
    public void checkEvenOdd(int input){
        if(input%2==0){
            System.out.println("Number is Even");
        }
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.checkEvenOdd(46);
    }
}
