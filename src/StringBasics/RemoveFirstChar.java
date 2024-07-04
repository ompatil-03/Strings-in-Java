package StringBasics;

import java.util.Scanner;

public class RemoveFirstChar {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=new char[s1.length()-1];
        int count=0;
//        String s2=s1.substring(1);
//        System.out.println("The New String is :\n"+s2);
//        for (int i = 1; i < s1.length(); i++) {
//              ch[count++]=s1.charAt(i);
//        }
//        String s2=new String(ch);
//        System.out.println("The new string after removing firs char is :\n"+s2);
        String s3=s1.substring(0,s1.length()-1);
        System.out.println("The new String is :\n"+s3);
    }
}
