package HighLevelPracticeProblem;

import java.util.Scanner;

public class KeypadTyping {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Keypad mapping is :");
        keypad(str);
    }
    public static void keypad(String s){
        char[] ch=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int ans=(int)(ch[i]-'a');
            if(ans==18||ans==25){
                System.out.print((ans/3)+1);
            }else {
                System.out.print((ans/3)+2);
            }
        }

    }
}
