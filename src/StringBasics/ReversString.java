package StringBasics;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n=s1.length();
        char ch[]=new char[n];
        int count=0;
        for (int i = n-1; i>=0 ; i--) {
            ch[count++]=s1.charAt(i);
        }
        String  s2=new String(ch);
        System.out.println("The reversed String is :\n"+s2);
    }
}
