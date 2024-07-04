package HighLevelPracticeProblem;

import java.util.Scanner;

public class SpecialSwap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        System.out.println("The new String :");
        swap(str);
    }
    public static void swap(String s){
       char[]ch=s.toCharArray();
       char[]ch2=new char[ch.length];
       int count=0;
        for (int i = 0; i < ch.length; i++) {
            if (isChar(ch[i])){
                ch2[count++]=ch[i];
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if (isChar(ch[i])){
               ch[i]= ch2[--count];
            }
        }
        System.out.println(new String( ch));
    }
    public static boolean isChar(char ch){
      boolean b=false;
       ch=Character.toLowerCase(ch);
        for (char i = 'a'; i <='z'; i++) {
            if(ch==i){
                b=true;
            }
        }
        return b;
    }
}
