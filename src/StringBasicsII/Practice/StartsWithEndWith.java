package StringBasicsII.Practice;

import java.util.Scanner;

public class StartsWithEndWith {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        System.out.println("Enter the String you want to check:");
        String ch=s.nextLine();
        System.out.println("Does string starts with ["+ch+"] : "+s1.startsWith(ch));
        System.out.println("Enter the String you want to check:");
        String ch1=s.nextLine();
        System.out.println("Does string ends with ["+ch1+"] : "+s1.endsWith(ch1));
    }
}
