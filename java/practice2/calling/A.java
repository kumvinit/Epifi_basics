package practice2.calling;

import practice2.testing.Z;

public class A {
    public static void main(String[] args) {
        Z obj = new Z();
        int sum, sub;
        sum = obj.sum(2, 3);
        sub = obj.sub(5, 2);
        obj.mul(sum, sub);
    }
}