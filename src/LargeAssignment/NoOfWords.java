package LargeAssignment;

import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The no of words are :"+words(str));
    }
    public static int words(String s){
        String[] str=s.split(" ");
        return str.length;
    }
}
