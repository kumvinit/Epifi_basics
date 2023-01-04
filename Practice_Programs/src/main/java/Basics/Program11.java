package Basics;
/*print the pattern
0 1
1 2
2 3
3 4
4 5  */
public class Program11 {
    public static void main(String[] args) {
        int i,j,k=0,row=5;
        for (i=0;i<row; i++){
            for (j=0; j<2; j++) {
                System.out.print(j+k + " ");
            }
            k=k+1;
            System.out.println();
        }
    }
}
