package LargeAssignment;

import java.util.Scanner;

public class FirstOccurrenceOfSubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1=s.nextLine();
        System.out.println("Enter a Sub-String :");
        String str2=s.nextLine();
        System.out.println("The first occurrence of sub-string is :"+str1.indexOf(str2));
    }
}
