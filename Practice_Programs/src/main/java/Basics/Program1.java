package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Read and Print an Integer value
/*public class Program1 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number : - ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered integer is : - " + num);
    }
}*/

//Other way to read input
public class Program1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the name: - ");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name= reader.readLine();
        System.out.println("My name is " + name);
    }
}

