package LargeAssignment;

import java.util.Scanner;

public class WordOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        wordOccurrence(str);
    }
    public static void wordOccurrence(String s){
        String[] str=s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if(!str[i].equals("*")){
                int count=1;
                for (int j = i+1; j < str.length; j++) {
                    if (str[i].equals(str[j])){
                        count++;
                        str[j]="*";
                    }
                }
                System.out.println("Word :"+str[i]+" :: occurrence :"+count);
            }
        }
    }
}
