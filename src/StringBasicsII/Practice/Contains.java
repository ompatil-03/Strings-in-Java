package StringBasicsII.Practice;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        System.out.println("Enter another String :");
        String s2=s.nextLine();
       if (s1.contains(s2)){
           System.out.println("The string 2 is present inside string 1");
       }else {
           System.out.println("The string 2 is NOT present inside string 1");
       }
    }
}
