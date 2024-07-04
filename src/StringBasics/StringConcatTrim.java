package StringBasics;

import java.util.Scanner;

public class StringConcatTrim {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter another string :");
        String s2=s.nextLine();
        String s3=s1.concat(s2);
        System.out.println("The string after concatenation is :"+s3);
        System.out.println("Enter another string with spaces :");
        String s4=s.nextLine();
        System.out.println("The string  be-four Trim:"+s4+"Now");
        System.out.println("The string after Trim:"+s4.trim()+"Now");
    }
}
