package StringBasicsII;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        System.out.println("Enter the Start index:");
        int b=s.nextInt();
        System.out.println("Enter the end index:");
        int e=s.nextInt();

        System.out.println("Using beginning index:"+s1.substring(b));
        System.out.println("Using beginning and end index:"+s1.substring(b,e));
    }
}
