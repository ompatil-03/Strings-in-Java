package LargeAssignment;

import java.util.Scanner;

public class ReversVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        System.out.println("Revers Vowel:"+reversVowel(str));
    }
    public static String reversVowel(String s){
       char[] ch=s.toCharArray();
       StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])){
                sb.append(ch[i]);
            }
        }
        sb.reverse();
       // System.out.println(sb);
        int count=0;
        StringBuilder sb2=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                sb2.append(sb.charAt(count++));
            }else {
                sb2.append(s.charAt(i));
            }
        }
        return sb2.toString();
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u';
    }
}
