package StringBasics;

import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("The Characters present at Even position are :");
        for (int i = 0; i < s1.length(); i++) {
            if (i%2==0)
            System.out.print(s1.charAt(i)+"  ");

        }
        System.out.println("\nThe Characters present at Odd position are :");
        for (int i = 0; i < s1.length(); i++) {
            if (i%2==1)
                System.out.print(s1.charAt(i)+"  ");

        }
    }
}
