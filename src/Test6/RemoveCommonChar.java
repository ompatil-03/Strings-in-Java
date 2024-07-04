package Test6;

import java.util.Scanner;

public class RemoveCommonChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1 = s.nextLine();
        System.out.println("Enter another String :");
        String str2=s.nextLine();
        System.out.println("The new String is :"+combine(str1,str2));
    }
    public static String combine(String s1,String s2){
        StringBuilder sb1=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder(s2);
        StringBuilder sb3=new StringBuilder();
        for (int i = 0; i < sb1.length(); i++) {
            int count=0;
            for (int j = 0; j < sb2.length(); j++) {
                if(sb1.charAt(i)==sb2.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                sb3.append(sb1.charAt(i));
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            int count=0;
            for (int j = 0; j < sb1.length(); j++) {
                if(sb2.charAt(i)==sb1.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                sb3.append(sb2.charAt(i));
            }
        }
        return sb3.toString();
    }
}
//aacdb gafd