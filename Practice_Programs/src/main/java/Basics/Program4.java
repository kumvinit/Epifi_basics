package Basics;
//Print table of 1-20
public class Program4 {
    public static void main(String[] args) {
            for (int n=1; n<=20; n++)
            {
                int m=1;
                while (m<=10) {
                    int result=n*m;
                    System.out.println(n + "*" + m + "=" + result);
                    m++;
                }
                System.out.println("\t");
            }
    }
}
