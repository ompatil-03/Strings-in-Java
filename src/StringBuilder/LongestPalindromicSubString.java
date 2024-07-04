package StringBuilder;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        String ans="";
        StringBuilder sb1;
        StringBuilder sb2;
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                sb1=new StringBuilder();
                sb2=new StringBuilder();
                sb1.append(str, i, j+1);
                sb2.append(str, i, j+1);
                if ((sb1.toString()).equals(sb2.reverse().toString())&& sb1.length()>max){
                    max=sb1.length();
                    ans=sb1.toString();

                }
            }

        }
        System.out.println("The Longest Palindromic string is :");
        System.out.println(ans);
    }
}
