package LargeAssignment;

import java.util.Scanner;

public class LongestSubStringWithDistinctChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The length of non repeating sub string is :\n"+longest(str));;
    }
    public static int longest(String s){
        StringBuilder sb=new StringBuilder();
        int max=0,ans=0;
        for (int i = 0; i < s.length(); i++) {
            if (!sb.isEmpty()&&sb.toString().contains(s.charAt(i)+"")){
                if (max<sb.length()){
                    max=sb.length();
                }
                sb.delete(0,sb.length());
            }else {
                sb.append(s.charAt(i));
            }
        }
        return max;
    }
}
