package AssignmentIII;

import java.util.Scanner;

public class UpperLowerDigitSpice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        int upper=0,lower=0,spicel=0,digit=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upper++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
            if(spical(str.charAt(i))){
                spicel++;
            }
            if(Character.isDigit(str.charAt(i))){
                digit++;
            }
        }
        System.out.println("Number of uppercase: "+upper);
        System.out.println("Number of lower: "+lower);
        System.out.println("Number of spicel: "+spicel);
        System.out.println("Number of digit: "+digit);


    }
    public static boolean spical(char ch) {
            return  (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') ) ;
    }

}
