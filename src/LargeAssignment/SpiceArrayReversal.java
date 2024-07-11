package LargeAssignment;

import jdk.dynalink.support.ChainedCallSite;

import java.util.Scanner;

public class SpiceArrayReversal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The ans is:"+reversal(str));
    }
    public static String reversal(String s){
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
       //j System.out.println(sb);
        sb.reverse();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                sb1.append(sb.charAt(count++));
            }else {
                sb1.append(s.charAt(i));
            }
        }
        return sb1.toString();
    }
}
