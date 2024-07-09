package LargeAssignment;

import jdk.dynalink.support.ChainedCallSite;

import java.util.Scanner;

public class ContainsUniqueChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        if (unique(str).isEmpty()){
            System.out.println("The given String does not contains any unique Char");
        }else {
            System.out.println("contains unique char ");
            System.out.println(unique(str));
        }
    }
    public static String unique(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int val=(int)(s.charAt(i));
            if(!Character.isLetter(s.charAt(i))&&!(Character.isWhitespace(s.charAt(i)))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
