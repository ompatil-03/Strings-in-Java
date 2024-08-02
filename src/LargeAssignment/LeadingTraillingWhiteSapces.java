package LargeAssignment;

import java.util.Scanner;

public class LeadingTraillingWhiteSapces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Answer String :"+str.trim());
    }
}
