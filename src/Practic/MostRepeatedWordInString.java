package Practic;

import java.util.Scanner;

public class MostRepeatedWordInString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String ans=s.nextLine();
        System.out.println("The most repeated word is :"+mostRepeated(ans));

    }
    public static String mostRepeated(String str){
        String[] arr=str.split(" ");
        int max=0,count=0,ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=i;
            }
        }
        return arr[ans];
    }
}
