package Basics;

import java.util.Scanner;

//Check if number is Odd or even
public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if (num<=0){
            System.out.println("NULL");
        } else if (num%2==0) {
            System.out.println("Number if even");
        }else {
            System.out.println("number is odd");
        }
    }
}
