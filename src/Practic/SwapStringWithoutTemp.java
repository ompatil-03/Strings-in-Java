package Practic;

import java.util.Scanner;

public class SwapStringWithoutTemp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String ans1=s.nextLine();
        System.out.println("Enter a String 2:");
        String ans2=s.nextLine();
        int a=ans1.length();
        ans1=ans1+ans2;
        ans2=ans1.substring(0,a);
        ans1=ans1.substring(a);
        System.out.println("The value of  string 1 after swapping is : "+ans1);
        System.out.println("The value of string 2 after swapping is : "+ans2);
    }
}
