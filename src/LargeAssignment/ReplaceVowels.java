package LargeAssignment;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter the char you want to replace it with :");
        char ch=s.next().charAt(0);
        System.out.println("The new string is :"+replace(str,ch));

    }
    public static String replace(String s,char ch){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                sb.append(ch);
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o' ||ch=='u';
    }
}
