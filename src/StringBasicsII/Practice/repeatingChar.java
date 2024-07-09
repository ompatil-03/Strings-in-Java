package StringBasicsII.Practice;

import java.util.Scanner;

public class repeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("The new String is :");
        removeDuplicates(s);
    }
    public static void removeDuplicates(String s){
        char ch[] =s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j =i+1; j < ch.length; j++) {
                   if(ch[i]==ch[j]){
                       ch[j]='*';
                   }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='*'){
                System.out.print(ch[i]);
            }
        }
    }
}
