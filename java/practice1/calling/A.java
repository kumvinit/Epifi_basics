package practice1.calling;

public class A {

    public A(){
        System.out.println("This is Constructor");
    }
    public int sum(int a, int b){
        int sumresult=a+b;
        return sumresult;
    }
    public int sub(int a, int b){
        int subresult=a-b;
        return subresult;
    }
    public void mul(int a, int b){
        int mulresult= a*b;
        System.out.println(mulresult);
    }
}
