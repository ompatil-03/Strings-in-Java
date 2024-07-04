package AssignmentIII;

import java.util.Scanner;

public class LexicographicallyComparison {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String str1=s.nextLine();
        System.out.println("Enter a String 2:");
        String str2=s.nextLine();
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
