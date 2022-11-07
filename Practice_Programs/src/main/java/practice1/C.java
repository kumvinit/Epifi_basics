package practice1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Write a program to show grades as per the marks given in 5 subjects
public class C {
    public static void main(String[] args) {
        float physics, chemistry, biology, maths, computers, total, average;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in all 5 subjects: - ");
        physics=sc.nextFloat();
        chemistry=sc.nextFloat();
        maths=sc.nextFloat();
        computers=sc.nextFloat();
        biology=sc.nextFloat();

        total=physics+chemistry+maths+biology+computers;
        average=(total/5);

        if(average>=90){
            System.out.println("Grade A - " + average);
        } else if (average>=80) {
            System.out.println("Grade B - " + average);
        } else if (average>=70) {
            System.out.println("Grade C - " + average);
        } else if (average>=60) {
            System.out.println("Grade D - " + average);
        } else if (average>=40) {
            System.out.println("Grade E - " + average);
        }else {
            System.out.println("Grade F - " + average);
        }
    }
}
