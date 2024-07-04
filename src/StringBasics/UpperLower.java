package StringBasics;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Original: "+s1);
        System.out.println("Uppercase: "+s1.toUpperCase());
        System.out.println("Lower: "+s1.toLowerCase());
    }
}
