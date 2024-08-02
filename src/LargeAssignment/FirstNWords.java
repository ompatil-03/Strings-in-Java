package LargeAssignment;

import java.util.Scanner;

public class FirstNWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        System.out.println("Enter the value of n :");
        int n=s.nextInt();
        last(str,n);
    }
    public static void first(String s,int n){
        String[] str=s.split(" ");
        System.out.println("First "+n+" words are :");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i]+" ");
        }
    }
    public static void last(String s,int n){
        String[] str=s.split(" ");
        System.out.println("last "+n+" words are :");
        for (int i = 0; i < str.length; i++) {
           if (i>str.length-1-n){
               System.out.print(str[i]+" ");
           }
        }
    }
}
