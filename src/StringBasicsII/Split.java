package StringBasicsII;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1=s.nextLine();
        System.out.println("Enter string regax :");
        String s2=s.nextLine();
        System.out.println("The array of given string is :"+ Arrays.toString(s1.split(s2)));
    }
}
