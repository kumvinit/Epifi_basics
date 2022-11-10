package practice5;
//Program to interchange the value of two variables using third variable
public class A {
    public static void main(String[] args) {
        //Exchange value of two variables using 3rd variable
        int i=100;
        int j=200;
        int k=i; //k stores the value of i, k=100
        i=j; //i has the value 200 now, i=200
        j=k; //the value of i is transferring getting transferred to j using k
        System.out.println(i); //should print i=200
        System.out.println(j); //should print j=100
    }
}
