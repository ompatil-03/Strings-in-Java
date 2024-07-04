package StringBasics;

import java.util.Scanner;

public class StringMethodI {
    public static void main(String[] args) {
        String s="Java Program";
        System.out.println("Original String :"+s);
        s=s.toUpperCase();
        System.out.println("Uppercase Modification: "+s);
        s=s.toLowerCase();
        System.out.println("Lower case Modification: "+s);
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter the index position: ");
        int n=sd.nextInt();
        System.out.println("The char at index "+n+" is : "+s.charAt(n) );
        System.out.println("Printing characters  of string :");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
