package practice9;
//Print a table but only display numbers which are not multiples of 3,5 & 7
public class B {
    public void Print_Table(int a, int b){
        int flag=1, i, j;
        for(i=1;i<=a;i++) {
            for (j=1;j<=b; j++) {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.Print_Table(5, 5);
    }
}
