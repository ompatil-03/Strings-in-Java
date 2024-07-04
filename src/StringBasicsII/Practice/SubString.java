package StringBasicsII.Practice;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1=s.nextLine();
        System.out.println("Enter the range of substring:");
        int b=s.nextInt();
        int e=s.nextInt();
        System.out.println("The required sub string is :\n"+s1.substring(b,e));
    }
}
