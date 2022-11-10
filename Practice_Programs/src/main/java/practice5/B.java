package practice5;
//Program to interchange the value of two variables without using third variable
public class B {
    public static void main(String[] args) {
        int i=100;
        int j=200;
        //Without using 3rd variable exchanging the value of two valriables
        i=i+j; //i is 300
        j=i-j; //i became 300 so 300-200=100
        i=i-j;
        System.out.println(i);
        System.out.println(j);
    }
}
