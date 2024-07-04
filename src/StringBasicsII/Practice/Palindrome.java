package StringBasicsII.Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        if (s1.equals(revers(s1))){
            System.out.println("The given string is Palindrome String .");
        }else {
            System.out.println("The given string is not Palindrome");
        }
    }
    private static String revers(String s) {
        char ch[]=s.toCharArray();
        char ch1[]=new char[ch.length];
        int count=0;
        for (int i =ch.length-1; i >=0 ; i--) {
            ch1[count++]=ch[i];
        }
        return new String(ch1);
    }
}
