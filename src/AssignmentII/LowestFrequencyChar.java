package AssignmentII;

import java.util.Scanner;

public class LowestFrequencyChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("The minimum occurance of char is :"+lowest(str));
    }
    public static char lowest(String s){
        int min=Integer.MAX_VALUE,count=0;
        char ch=' ';
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if (min>count){
                min=count;
                ch=s.charAt(i);
            }
        }
        return ch;
    }
}
