package Test6;

import java.util.Scanner;

public class DeleteAlternateChar {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("the answer is :"+sb);
    }
}
