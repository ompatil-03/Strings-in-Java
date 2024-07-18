package LargeAssignment;

import java.util.Scanner;

public class EndsWithStartsWith {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        System.out.println("Enter to check starts with:");
        String starts=s.next();
        System.out.println("Enter to check ends with:");
        String ends=s.next();
        System.out.println("Starts with "+starts+" : "+s1.startsWith(starts));
        System.out.println("Ends with "+ends+" : "+s1.endsWith(ends));
    }
}
