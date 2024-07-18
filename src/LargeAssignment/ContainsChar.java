package LargeAssignment;

import java.util.Scanner;

public class ContainsChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter the char you want to check:");
        String str2=s.nextLine();
        if (str.contains(str2)){
            System.out.println("Char is present in given String");
        }else {
            System.out.println("The chat is not present in given string");
        }
    }
}
