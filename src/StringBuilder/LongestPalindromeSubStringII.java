package StringBuilder;

import java.util.Scanner;

public class LongestPalindromeSubStringII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        String ans="";
        StringBuilder sb1=new StringBuilder(str);
        while(!isPalindrome(sb1) && !sb1.isEmpty()){
            sb1.deleteCharAt(sb1.length()-1);
            sb1.reverse();
        }
        System.out.println(sb1);

    }
    public static boolean isPalindrome(StringBuilder s){
        StringBuilder sb=new StringBuilder(s);
        return s.toString().contentEquals(sb.reverse());
    }
}
