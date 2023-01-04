package Basics;

public class Program6 {
    public static void main(String[] args) {
        int i,j,row=6;
        //outer loop for column
        for (i=1;i<row;i++){
            //inner loop for row
            for (j=(i+1);j<=(row+i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
