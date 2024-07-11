package LargeAssignment;

import java.util.Scanner;

public class AlternateChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The modified String is :"+ alternate(str));
    }
    public static String alternate(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
