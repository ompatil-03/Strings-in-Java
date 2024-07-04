package AssignmentIII;

import java.util.Scanner;

public class StrartsWithVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        if (isVowel(str.charAt(0))){
            System.out.println("The given String starts with Vowel ");
        }else {
            System.out.println("The given Sting does not start with Vowel ");
        }
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
