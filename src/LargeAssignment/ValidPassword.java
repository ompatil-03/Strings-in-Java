package LargeAssignment;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        valid(str);
    }
    public static void valid(String  s){
        if (s.length()<8){
            System.out.println("Invalid Password !");
            return;
        }
        boolean spicel=false,num=false,ch=false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                ch=true;
            }else if (Character.isDigit(s.charAt(i))){
                num=true;
            } else  {
                spicel=true;
            }

        }
        if (spicel&&num&&ch){
            System.out.println("Valid Password !");
        }else {
            System.out.println("Invalid Password !");
        }
    }
}
