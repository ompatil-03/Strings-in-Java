package Practic;

import java.util.Scanner;

public class LargestSmallestWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String ans1=s.nextLine();
        largestSmallest(ans1);
    }
    public static void largestSmallest(String str){
        String[] arr=str.split(" ");
        int max=0,count=0,ans=0,min=Integer.MAX_VALUE,ans2=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].length()>max){
               max=arr[i].length();
               ans=i;
           }
            if(arr[i].length()<min){
                min=arr[i].length();
                ans2=i;
            }
        }
        System.out.println("The Largest word is :"+arr[ans]);
        System.out.println("The Smallest Word is :"+arr[ans2]);

    }
}
