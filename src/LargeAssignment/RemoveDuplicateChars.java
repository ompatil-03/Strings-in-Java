package LargeAssignment;

import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The modified String is :"+duplicates(str));
    }
    public static String duplicates(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(!sb.toString().contains(s.subSequence(i,i+1))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
