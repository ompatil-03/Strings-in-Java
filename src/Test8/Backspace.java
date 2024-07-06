package Test8;

import java.util.Scanner;

public class Backspace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = s.nextLine();
        System.out.println("Enter string 2");
        String str2 = s.nextLine();
        System.out.println(backspace(str1).equals(backspace(str2)));


    }
    public static String backspace(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
//geee#e#ks  gee##eeks
