package LargeAssignment;

import java.util.Scanner;

public class RemovePunctuationMarks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("The modified string is :\n"+punctuation(str));
    }
    public static String punctuation(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int val=(int)(s.charAt(i));
            if((val>=65 && val<=90)||(val>=97 && val<=122)||Character.isWhitespace(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
