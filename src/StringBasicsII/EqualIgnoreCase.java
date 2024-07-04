package StringBasicsII;

import java.util.Scanner;

public class EqualIgnoreCase {
    public static void main(String[] args) {
        System.out.println("Enter string 1:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter string 2:");
        String s2=s.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both Strings are equal");
        }else {
            System.out.println("Both Strings are Not equal");
        }
    }
}
