package Basics;
/*print the pattern
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7 */
public class Program10 {
    public static void main(String[] args) {
        int i,j,k=0,row=4;
        for (i=1; i<=row; i++){
            for (j=1; j<=4; j++){
                System.out.print(j+k + " ");
            }
            k = k + 1;
            System.out.println();
        }
    }
}
