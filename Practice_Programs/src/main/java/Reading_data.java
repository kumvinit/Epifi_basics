import java.util.Scanner;

public class Reading_data {
    public static void main(String[] args) {
        System.out.println("Please enter your name : - ");
        Scanner sc=new Scanner(System.in); //Input function
        String name=sc.nextLine();
        System.out.println("My name is " + name);
    }
}
