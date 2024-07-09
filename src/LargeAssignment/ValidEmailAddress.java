package LargeAssignment;

import java.util.Scanner;

public class ValidEmailAddress {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        if (valid(str)){
            System.out.println("The Given email is valid.");
        }else {
            System.out.println("The give Email is In-Valid");
        }
    }
    public static boolean valid(String s){
        char ch='@';
        char ch2='.';
        int count1=0,count2=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ch){
                count1++;
            }
            if(s.charAt(i)==ch2){
                count2++;
            }
        }
        return count1==1&& count2==1;
    }
}
