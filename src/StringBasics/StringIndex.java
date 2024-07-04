package StringBasics;

import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {
        System.out.println("Enter the String you want :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("The string is : "+s1);
        System.out.println("Enter the char whose position you want :");
        char ch=s.next().charAt(0);
        System.out.println("The index of character "+ch+" is : "+indOf(s1,ch));
        System.out.println("Enter the last index of character you want to check:");
        char ch1=s.next().charAt(0);
        s1.trim();
        System.out.println("The last index of char "+ch1+" is: "+lastIndOf(s1,ch1));
    }
    public static int indOf(String s,char ch){
        return s.indexOf(ch);
    }
    public  static int lastIndOf(String s, char ch){
        return s.lastIndexOf(ch);
    }
}
