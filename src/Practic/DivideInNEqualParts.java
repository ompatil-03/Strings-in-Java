package Practic;

import java.util.Arrays;
import java.util.Scanner;

public class DivideInNEqualParts {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String ans=s.nextLine();
        System.out.println("Enter the value of N: ");
        int n=s.nextInt();
        String str=divide(ans,n);
        if (str==null){
            System.out.println("Can't create equal parts ");
        }else {
            String[] arr=str.split(" ");
            System.out.println(Arrays.toString(arr));
        }

    }
    public static String divide(String s,int n){
        StringBuilder sb=new StringBuilder();
        if(s.length()%n!=0){
            return null;
        }
        int val=s.length()/n;

        for (int i = 0; i < s.length(); i++) {
            if(i%val==0){
                sb.append(" ");
            }
            sb.append(s.charAt(i));
        }
        return sb.toString().trim();
    }
}
