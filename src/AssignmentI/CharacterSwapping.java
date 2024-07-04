package AssignmentI;

import java.util.Random;
import java.util.Scanner;

public class CharacterSwapping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        Random r=new Random();
        int a=r.nextInt(ch.length);
        int b=r.nextInt(ch.length);
        char temp=ch[a];
        ch[a]=ch[b];
        ch[b]=temp;
        String str2=new String(ch);
        System.out.println("The new String is:"+str2);
    }
}
