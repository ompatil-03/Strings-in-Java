package StringBufferI;

import java.util.Scanner;

public class PalindromeStringBuffer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String sb=s.next();
        StringBuffer s1=new StringBuffer(sb);
        s1.reverse();
        String s2=s1.toString();

        if(s2.equals(sb)){
            System.out.println("the given String is palindromic String");
        }else {
            System.out.println("the given string is not palindromic String");
        }
    }
}
