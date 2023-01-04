package Basics;

import java.util.Scanner;

//Getting average of subject marks
public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("Enter the marks: ");
        for (int i=0; i<n; i++){
            sum=sum+sc.nextInt();
        }
        double avg =sum/n;
        System.out.println("Average of all subjects is: " + avg);
    }
}
