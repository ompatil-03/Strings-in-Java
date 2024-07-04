package AssignmentI;

import java.util.Scanner;

public class WordCharCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        String[] arr=str.split(" ");
        System.out.println("The number of word in given string are :: "+arr.length);
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("The number of characters in given string are ::"+count);
    }
}
