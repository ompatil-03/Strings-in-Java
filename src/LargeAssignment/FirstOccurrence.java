package LargeAssignment;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter another string :");
        String s2=s.nextLine();
        System.out.println("The first occurrence of word is at index:"+occurrence(s1,s2));
    }
    public static int occurrence(String s1,String s2){
        String str[]=s1.split(" ");
        int ans=0;
        int count=0;
        for (int i = 0; i < str.length; i++) {
            if (s2.equals(str[i])){
                return i;
            }
        }
        return ans;
    }
}
