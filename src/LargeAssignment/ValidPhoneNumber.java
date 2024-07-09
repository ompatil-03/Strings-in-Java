package LargeAssignment;

import java.util.Scanner;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        if (validPhone(s)){
            System.out.println("The given number is valid !");
        }else {
            System.out.println("The given number is not valid !");
        }
    }
    public  static boolean validPhone(String s){
        if (s.length()!=10){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
