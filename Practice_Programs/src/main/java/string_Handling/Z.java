package string_Handling;

//String is a special type of class for which we can create constructor or objects too
//String has many methods - length, trim, uppercase, lowercase
//string functions: chatAt, replace, concatenate,
//equals, equalIgnoreCase, compareTo, compareToIgmoreCase

public class Z {
    public void Str_handling() {
        String s = "  Hello World ";
        String s1=  "India";
        System.out.println("Length of the string is " + s.length());
        System.out.println("After trimming the length of string is : - " + s.trim().length());
        //trim must be used before and not after length method
        System.out.println("String after trimming in uppercase : - " + s.trim().toUpperCase());
        System.out.println("Without trimming String in lowercase : - " + s.toLowerCase());
        System.out.println(s.charAt(5)); //for finding the index value we use this method : charAt(index)
        System.out.println(s.replace('o', 'O'));//replacing O with o
        System.out.println(s.concat(" ").concat(s1));//concatenation
        System.out.println(s.substring(2, 7));
        System.out.println(s.contains("World"));
    }
    public void Compare_check1(){
        String s1, s2;
        s1="Hello"; s2="hello";
        if (s1.equals(s2)){
            System.out.println("Both the strings are same"); //The cases must also be same
            //use s1.equalsIgnoreCase()
        }else {
            System.out.println("Strings are different");
        }
    }
    public void Compare_check2(){
        String s1, s2;
        s1="Hello World"; s2="hello world";
        if (s1.compareTo(s2)==0){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }//To ignore case sensitivity use compareToIgnoreCase() method
    }
    public static void main(String[] args) {
        Z obj=new Z();
        obj.Str_handling();
        obj.Compare_check1();
        obj.Compare_check2();
    }
}
