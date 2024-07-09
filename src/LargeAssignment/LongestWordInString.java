package LargeAssignment;

import java.util.Scanner;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        String[] arr=str.split(" ");
        String max="";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>max.length()){
                max=arr[i];
            }
        }
        System.out.println("The Longest word in given string is :"+max);
    }
}
