package StringBasics;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s1.toLowerCase();
        int vow=0;
        int cons=0;
        for (int i = 0; i < s2.length(); i++) {
            if (isVowels(s2.charAt(i))){
                vow++;
            }else {
                cons++;
            }

        }
        System.out.println("There are "+vow+" vowels and "+cons+" consonants present inside given string .");
    }
    public static boolean isVowels(char ch){
        return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
