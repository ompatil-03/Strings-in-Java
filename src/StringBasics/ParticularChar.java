package StringBasics;

import java.util.Scanner;

public class ParticularChar {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter the character you want to look for :");
        char ch=s.next().charAt(0);
        int n=s1.indexOf(ch);
        if(n<0){
            System.out.println("The char is not present in given string .");
        }else {
            System.out.println("The char is at index of "+n);
        }

    }
}
