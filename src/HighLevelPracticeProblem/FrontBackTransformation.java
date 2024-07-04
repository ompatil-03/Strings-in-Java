package HighLevelPracticeProblem;

import java.util.Scanner;

public class FrontBackTransformation {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The new String is :");
        System.out.println(hex(str));


    }
    public static String hex(String s){
        char ch[] =s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(isLower(ch[i])){
                int num=(int)(s.charAt(i)-'a');
                ch[i]=(char)('z'-num);
            }else{
                int num=(int)(s.charAt(i)-'A');
               ch[i]=(char)('Z'-num);
            }
        }
        return new String(ch);
    }
    public static boolean isLower(char ch){
        boolean b=false;
        for (char i = 'a' ;i<='z'; i++) {
                if (i==ch){
                    b=true;
                }
        }
        return b;
    }
}
