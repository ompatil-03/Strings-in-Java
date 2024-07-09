package LargeAssignment;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramsString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1=s.nextLine();
        System.out.println("Enter String 2:");
        String str2=s.nextLine();
        if (anagrams(str1,str2)){
            System.out.println("The given Strings are Anagrams !");
        }else {
            System.out.println("The given Strings are not Anagrams !");
        }
    }
    public static boolean anagrams(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
