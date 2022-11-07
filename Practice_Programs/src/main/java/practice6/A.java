package practice6;
//find the largest number among 3 passed in argument.
public class A {
    public void CompareNumbers(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("a is largest");
        } else if (b>c && b>a) {
            System.out.println("b is largest");
        }else if(c>a && c>b){
            System.out.println("c is largest");
        }else {
            System.out.println("All numbers are equal");
        }
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.CompareNumbers(22, 22, 22);
    }
}
