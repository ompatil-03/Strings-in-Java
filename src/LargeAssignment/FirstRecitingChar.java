package LargeAssignment;

import java.util.Scanner;

public class FirstRecitingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        int count=0;
        char[] ch=s.toCharArray();
        System.out.println("The first repeating char is :");
        for (int i = 0; i < ch.length; i++) {
            for (int j =i+1; j < ch.length; j++) {
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]);
                    count++;
                    break;
                }
            }
            if (count>0){
                break;
            }
        }
    }
}
