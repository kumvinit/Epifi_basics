package practice8;
//Program to enter month number and print number of days in respective month
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter month number from 1 to 12 where 1=Jan and 12=Dec : -");
        int month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("I have 31 days");
        } else if (month == 2) {
            System.out.println("I have 28 days usually and 29 in leap year");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("I have 30 days");
        }
    }
}
