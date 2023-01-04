package Basics;
/*Given an integer  as input, can you check the following:
If  is odd then print "Weird"
If  is even and, in between range 2 and 5(inclusive), print "Not Weird"
If  is even and, in between range 6 and 20(inclusive), print "Weird"
If  is even and , print "Not Weird"*/
import java.util.Scanner;
public class Program12 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter the number to check: ");
            int n=sc.nextInt();
            if(n%2==0){
                for(n=2; n<=5; n++){
                    System.out.println("Not Weird");
                    break;
                }
                for(n=6; n>=20; n++){
                    System.out.println("Weird");
                    break;
                }if(n>20){
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }
        }
    }
