package AssignmentIII;

import java.util.Scanner;

public class FindVowelsI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))){
               count++;
            }
        }
        System.out.println("number of vowels are :"+count);
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
