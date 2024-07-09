package LargeAssignment;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter the word you want to replace :");
        String str1=s.nextLine();
        System.out.println("Enter the replacement word:");
        String str2=s.nextLine();
        System.out.println("The modified string is :"+replace(str,str1,str2));
    }
    public static String replace(String s ,String s1,String s2){
        String[] ch=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i].equals(s1)){
                sb.append(s2);
            }else {
                sb.append(ch[i]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
