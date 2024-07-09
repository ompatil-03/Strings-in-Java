package LargeAssignment;

import java.util.Scanner;

public class UrlValidation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        if (url(str)){
            System.out.println("The given String is valid URL");
        }else {
            System.out.println("The given String is NOT valid URL");
        }
    }
    public static boolean url(String s){
        return s.contains("https://");
    }
}
