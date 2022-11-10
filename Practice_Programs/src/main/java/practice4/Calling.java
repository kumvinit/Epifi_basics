package practice4;
//program to calculate result for (2+8)*(2+5+7)
public class Calling {
    public int sum(int a, int b){
        int sumresult=a+b;
        return sumresult;
    }
    public void mul(int a, int b){
        int muresult=a*b;
        System.out.println(muresult);
    }

    public static void main(String[] args) {
        Calling obj=new Calling();
        int c, d, e;
        c=obj.sum(2, 8);
        d=obj.sum(2, 5);
        e=obj.sum(d, 7);
        obj.mul(c, e);
    }
}
