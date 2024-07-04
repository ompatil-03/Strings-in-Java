package HighLevelPracticeProblem;

import java.util.Scanner;

public class IntegerToWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        System.out.println("===================");
        System.out.println("Answer :");
       intToWord(str);
    }
    public static void intToWord(String s){
        char [] ch=s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(word(ch[i])+"  ");
        }
    }
    public static String word(char ch){
        int val=ch-'0';
        String s;
        switch (val){
            case 1 : s="one";
            break;
            case 2 : s="two";
            break;
            case 3 : s="three";
            break;
            case 4: s="four";
            break;
            case 5: s="five";
            break;
            case 6: s="six";
            break;
            case 7: s="seven";
            break;
            case 8:  s="eight";
            break;
            case 9:  s="nine";
            break;
            default: s="void";
        }
        return s;
    }
}
