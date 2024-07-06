package Test8;

import java.util.Locale;
import java.util.Scanner;

public class CharAtSamePosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = s.nextLine();
        str1=str1.toLowerCase();
       // System.out.println(str1);
        int count=0;
        int ans=0;
        for (int i ='a',j=1; i <='z'&& j<str1.length() ; i++,j++) {
            if(str1.charAt(j)==(char)i){
               // System.out.println(str1.charAt(j)+"  "+i);
                ans++;
            }
        }
        System.out.println("The answer is :"+ans);
    }
}
