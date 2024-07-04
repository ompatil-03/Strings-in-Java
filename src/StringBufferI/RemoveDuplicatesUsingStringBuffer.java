package StringBufferI;

import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuffer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(!sb.toString().contains(str.substring(i,i+1))){
                sb.append(str.charAt(i));
            }
        }
        char ch='b';
        char ch1='a';
        System.out.println(Character.compare(ch,ch1));
    }
}
