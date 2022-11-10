public class Fibonacci_Series {
    public static void main(String[] args) {
        int n=0, n1=1, n2, count=10, i;
        System.out.print(n+" "+n1);
        for (i=2;i<count;i++)//started loop with 2 because we already printed 1 and 2 above
        {
            n2=n+n1;
            System.out.print(" "+n2);
            n=n1;
            n1=n2;
        }//closed for loop
    }
}
