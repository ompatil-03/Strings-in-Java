package AssignmentIII;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isWhitespace(ch[i])){
                ch[i]='*';
            }
        }
        System.out.println("The output is : "+(new String(ch)));

    }
}
