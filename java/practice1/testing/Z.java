package practice1.testing;

import practice1.calling.A;

public class Z {
    public static void main(String[]args){
        int sum, sub;
        A obj=new A();
        sum=obj.sum(1, 100);
        sub=obj.sub(10, 5);
        obj.mul(sum, sub);

    }
}
