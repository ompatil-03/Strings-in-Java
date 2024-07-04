package StringBasics;

public class StringI {
    public static void main(String[] args) {
        char[] c={'h','e','l','l','o'};
        String s=new String(c);
        System.out.println("Using character sequence string s :"+s);
        String s1="Java";
        s1="Hello World";
        s1="HTML";
        System.out.println("String s1: "+s1);
        s1=s1.concat("9-11");
        System.out.println("String s1: "+s1);

    }
}
