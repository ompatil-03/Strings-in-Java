package StringBasicsII.Practice;

import java.util.Scanner;

public class RemoveFirstChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1=s.nextLine();
//        System.out.println("The modified string is :\n"+removeFirst(s1));
        System.out.println("The string after removing last char: "+s1.substring(0,s1.length()-1));
    }

    private static String removeFirst(String s1) {
        return s1.substring(1);
    }
}
