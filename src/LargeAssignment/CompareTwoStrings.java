package LargeAssignment;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter another string :");
        String s2=s.nextLine();
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Two strings Are equal");
        }else {
            System.out.println("Two strings are not equal");
        }
    }
}
