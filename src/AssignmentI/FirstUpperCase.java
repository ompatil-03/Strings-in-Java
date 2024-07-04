package AssignmentI;

import java.util.Arrays;
import java.util.Scanner;

public class FirstUpperCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i].replace(arr[i].charAt(0),(char)(arr[i].charAt(0)-32));
        }
        System.out.println("the new String is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
