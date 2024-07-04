package HighLevelPracticeProblem;

import java.util.Scanner;

public class UncommonCharacters {
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
//        System.out.println("Enter a String :");
        String str="geeksforgeeks";
        System.out.println("The String one is :"+str);
//        System.out.println("Enter another string:");
        String str2="geeksquiz";
        System.out.println("The String two is :"+str2);
        System.out.println("Output is :");
        uncommon(str,str2);
    }
    public static void uncommon(String s1,String s2){
        String str="";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            int count=0;
            for (int j = 0; j < ch2.length; j++) {
                if(ch1[i]==ch2[j]){
                    count++;
                }
            }
            if (count==0){
                str+=ch1[i];
            }
        }
        for (int i = 0; i < ch2.length; i++) {
            int count=0;
            for (int j = 0; j < ch1.length; j++) {
                if(ch2[i]==ch1[j]){
                    count++;
                }
            }
            if (count==0){
                str+=ch2[i];
            }
        }
//        s1=new String(ch1);
//        s2=new String(ch2);
//        str=s1.concat(s2);
        System.out.println(str);
    }
    public static void uncommon2(String s1,String s2){
        String s="";
        int j=0;
        for (int i = 1; i <=s2.length()&&j<s2.length(); i++,j++) {
            if(!s1.contains(s2.substring(j,i))){
                s+=s2.substring(j,i);
            }
        }
        j=0;
        for (int i = 1; i <=s1.length()&&j<s1.length(); i++,j++) {
            if(!s2.contains(s1.substring(j,i))){
                s+=s1.substring(j,i);
            }
        }
        System.out.println(s);
    }
}
