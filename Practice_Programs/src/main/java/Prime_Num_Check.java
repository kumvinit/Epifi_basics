import java.util.Scanner;
//Program to check the prime number
public class Prime_Num_Check {
    public void isPrime(int n)//took argument:input number
    {
        if(n==0 || n==1){
            System.out.println("Number is not prime"); //for number 0 and 1 condition
        } else {
            boolean flag = false; //To take the result as true or false if number is divisible
            for (int i = 2; i < n; i++)
                //Condition to check the divisibility with all the numbers smaller than the input number
            {
                if (n % i == 0) //if number is divisible
                {
                    System.out.println("Number is not prime");
                    flag = true; //assigned flag value as 1 for this condition: when number is divisible
                    break;
                }
            }
            if (flag == false) //for the not divisible numbers flag=0 assigned
            {
                System.out.println("Number is prime");
            }
        }
    }
    public static void main(String[] args) {
        Prime_Num_Check obj=new Prime_Num_Check();
        obj.isPrime(7);
    }
}
