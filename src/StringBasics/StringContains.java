package StringBasics;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter the string you want to check");
        String s2=s.nextLine();
        if(s1.contains(s2)){
            System.out.println("String 2 is present in String 1");
        }else {
            System.out.println("String 2 is NOT present in String 1");
        }
    }
}
