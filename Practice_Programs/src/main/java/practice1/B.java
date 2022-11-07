package practice1;
//Program to check whether triangle is scalene, isosceles or equilateral
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        double side1, side2, side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for all three sides");
        side1=sc.nextDouble();
        side2=sc.nextDouble();
        side3=sc.nextDouble();

        if(side1==side2 && side2==side3 && side3==side1){
            System.out.println("This is Equilateral triangle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("This is Isosceles triangle");
        }else{
            System.out.println("This is Scalene triangle");
        }
    }
}
