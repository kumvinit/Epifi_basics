package practice9;
//program to print quadrilateral using stars
//In order to remove the spaces, remove if part.
public class A {
    public void Print_stars(int a, int b) {
        int i, j; //i indicates row and j indicates column
        for(i=1; i<=a; i++){
            for (j=1; j<=b; j++){
                if(i>=2 && j>=2 && i<=3 && j<=5){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        A obj=new A();
        obj.Print_stars(4, 6);
    }
}
