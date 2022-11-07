package practice1;
//Program to check if number if divisible by 5 or 11 or both or neither
public class A {
    public void DivisibilityCheck(int num){
        if(num%5==0 && num%11==0){
            System.out.println("number is divisible by both");
        } else if (num%5!=0 && num%11!=0) {
            System.out.println("Number is not divisible by 5 or 11");
        } else if (num%5==0 && num%11!=0) {
            System.out.println("Number is only divisible by 5");
        } else if (num%5!=0 && num%11==0) {
            System.out.println("Number is only divisible by 11");;
        }
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.DivisibilityCheck(66);
    }
}
