package LargeAssignment;

import java.util.Scanner;

public class FirstCharOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        String string=s.nextLine();
        System.out.println("Enter the character :");
        char character=s.next().charAt(0);
        System.out.println("The first character occurenece is at index :");
        for (int i = 0; i < string.length(); i++) {
            if (character==string.charAt(i)){
                System.out.println(i);
                break;
            }
        }
    }
}
