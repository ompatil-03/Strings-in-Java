package HighLevelPracticeProblem;

import java.util.Scanner;

public class RemoveIntegers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if (Character.isDigit(ch[i])&&Character.isDigit(ch[i+1])){
                System.out.print(ch[i]+""+ch[i+1]+" ");
            } else if(Character.isDigit(ch[i])){
                System.out.print(ch[i]+" ");
            }

        }

    }
    public static void remove(String s){
        char[]ch=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])){
                if(i+1<ch.length &&  Character.isDigit(ch[i+1])){
                    System.out.print(Character.getNumericValue(ch[i]));
                    System.out.print(Character.getNumericValue(ch[i+1]));
                    i++;
                }else {
                    System.out.print(Character.getNumericValue(ch[i]));
                }
                System.out.print("  ");
            }

        }
    }
}
