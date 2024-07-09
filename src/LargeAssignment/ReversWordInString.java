package LargeAssignment;

import java.util.Scanner;

public class ReversWordInString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1=s.nextLine();
        String[] str=s1.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(revers(str[i]));
            sb.append(" ");
        }
        System.out.println("The modified string is :\n"+sb);
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
