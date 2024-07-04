package StringBasicsII.Practice;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1=s.nextLine();
        System.out.println("The revers of given string is :\n"+revers(s1));
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
