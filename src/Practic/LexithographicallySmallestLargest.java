package Practic;

import java.util.Scanner;

public class LexithographicallySmallestLargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String ans1=s.nextLine();
        String []arr=ans1.split(" ");
        lexi(arr);

    }
    public static void lexi(String[] arr){
        int val=0,max=0,min=Integer.MAX_VALUE;
        int ans1=0,ans2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                val+=(int)(arr[i].charAt(j));
            }
            if (val>max){
                max=val;
                ans1=i;
            }
            if (val<min){
                min=val;
                ans2=i;
            }
        }
        System.out.println("The lexicogrphically larges string is :"+ arr[ans1]);
        System.out.println("The lexicogrphically smallest string is :"+ arr[ans2]);
    }
}
