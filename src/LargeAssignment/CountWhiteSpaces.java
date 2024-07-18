package LargeAssignment;

import java.util.Scanner;

public class CountWhiteSpaces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isWhitespace(ch[i])){
                count++;
            }
        }
        System.out.println("the number of white spaces are :"+count);

    }
}
