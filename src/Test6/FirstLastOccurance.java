package Test6;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        System.out.println("Enter the array elements :");
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the targert :");
        int target=s.nextInt();
        System.out.println("The first and last occuren is :"+ Arrays.toString(occurance(a,target)));

    }
    public static int[] occurance(int[] a,int target){
        int[] ans= {-1,-1};
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target && count==0){
                ans[0]=i;
                count++;
            } else if (a[i]==target) {
                ans[1]=i;
            }
        }
        return ans;
    }
}//1 3 4 5 5 5 5 145 47
