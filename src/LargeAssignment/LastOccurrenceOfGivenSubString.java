package LargeAssignment;

import java.util.Scanner;

public class LastOccurrenceOfGivenSubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter sub string :");
        String sub=s.nextLine();
        System.out.println("The last occurrence is : "+str.lastIndexOf(sub));
    }

}
