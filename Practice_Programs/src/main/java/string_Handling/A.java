package string_Handling;

public class A {
    public void String_value(int input)
    {
        String s1, s2, s3, s4;
        int index1, index2, i;
        s1="Hello Testing World";
        s2="Hello World";
        index1=s1.length()-10; //getting last 10 characters of 1st string
        index2=s2.length()-10; //getting last 10 characters of 2nd string
        for (i=index1; i<s1.length(); i++){
            System.out.print(s1.charAt(i));

        }
    }
}
