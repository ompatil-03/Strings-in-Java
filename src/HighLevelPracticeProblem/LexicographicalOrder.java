package HighLevelPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        System.out.println("The new string is :");
        lexi(str);
    }
    public static void lexi(String s){
        char[] c=s.toCharArray();
        int count=0;
        String ans="";
        for (int i = 0; i < c.length; i++) {
            for (int j =i+1; j < c.length; j++) {
                if(Character.getNumericValue(c[i])>Character.getNumericValue(c[j])){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }

            }
            if(Character.isDigit(c[i])){
                count+=Character.getNumericValue(c[i]);
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j =i+1; j < c.length; j++) {
                if(Character.isDigit(c[i])&& !Character.isDigit(c[j])){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
//        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            if(!Character.isDigit(c[i])){
                ans+=c[i];
            }
        }
        ans+=count;
        System.out.println(ans);
    }
}
