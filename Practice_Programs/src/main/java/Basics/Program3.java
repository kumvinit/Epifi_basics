package Basics;

import java.util.Scanner;
//Calculate area of Triangle
public class Program3 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the value of b : ");
            double b=sc.nextDouble();

            System.out.print("Enter the value of h : ");
            double h=sc.nextDouble();

            double area=(b*h)/2; //formula for triangle area
            System.out.println("Area of triangle is " + area);
        }
}
