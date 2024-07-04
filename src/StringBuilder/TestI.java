package StringBuilder;

import java.util.Scanner;

public class TestI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder sb;
        System.out.println("Enter a String :");
        String str=s.nextLine();
        sb=new StringBuilder(str);
        sb.append("III");
        System.out.println("Original String :"+sb);
        System.out.println("charAt(3) : " +sb.charAt(3));
        System.out.println("Revers Method :"+sb.reverse());
        System.out.println("Subsequence Method :"+sb.subSequence(1,5));
        System.out.println("Repeat Method :"+sb.repeat("java",3));
       // System.out.println(sb.chars());
      //  System.out.println(sb.offsetByCodePoints(2,2));
        System.out.println("Final String :"+sb);

    }
}
