package StringBasics;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter another string :");
        String s2=s.nextLine();
        System.out.println("The final String after concatenation is :"+s1.concat(s2));
    }
}
