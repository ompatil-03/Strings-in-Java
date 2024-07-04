package HighLevelPracticeProblem;

import java.util.Scanner;

public class PrintFirstLetter {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        printFistLetter(str);
    }
    public static void printFistLetter(String s){
        System.out.println("the first letters of every word in given string are:");
        String str[] =s.split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].charAt(0));
        }
    }
}
