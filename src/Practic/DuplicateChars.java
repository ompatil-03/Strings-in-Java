package Practic;

import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String ans1=s.nextLine();
        dupChars(ans1);
    }
    public static void dupChars(String s){
        System.out.println("the duplicate chars are :");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j) && !sb.toString().contains(s.substring(i,i+1))){
                    sb.append(s.charAt(i));
                    sb.append(" ");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
