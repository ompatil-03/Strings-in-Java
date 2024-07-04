package StringBasicsII.Practice;

import java.util.Scanner;

public class DifferentMethods {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=s.nextLine();
        System.out.println("Enter another String ");
        String str1=s.nextLine();

        System.out.println("Enter index  who's char you want from string 1:");
        int ind=s.nextInt();
        System.out.println("The char index is :"+s1.charAt(ind));
        System.out.println("-----------------------------------------");

        System.out.println("using compairTo() method :"+((str1.compareTo(s1)>0)?"String two is greater then one ":"String one is greater then two"));
        System.out.println("-----------------------------------------");
        System.out.println("The compaire to ignore is :"+((str1.compareToIgnoreCase(s1)>0)?"String two is greater then one ":"String one is greater then two"));
        System.out.println("-----------------------------------------");
        System.out.println("Concating str1 to str2 :"+str1.concat(s1));
        System.out.println("-----------------------------------------");
        System.out.println("Contains:"+str1.contains(s1));

    }
}
