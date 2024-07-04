package HighLevelPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ReversVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        reversVowels(str);
    }
    public static void reversVowels(String s){
        int count=0;
        char[] str=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        char[] ch=new char[count];
        count=0;
        for (int i = 0; i < s.length(); i++) {
          if (isVowel(s.charAt(i))){
              ch[count++]=s.charAt(i);
          }
        }
        count-=1;
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])){
                str[i]=ch[count--];
            }
        }
        System.out.println("The new String is :"+(new String(str)));
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
