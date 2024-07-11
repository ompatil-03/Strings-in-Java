package LargeAssignment;

import java.util.Locale;
import java.util.Scanner;

public class EasyString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        str=str.toLowerCase();
        System.out.println("The modified String is :"+simple(str));
    }
    public static String simple(String s){
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count=1,temp=0;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i]==ch[j]){
                    ch[j]='*';
                    count++;
                }else {
                    break;
                }
            }
            if (ch[i]!='*'){
                sb.append(count);
                sb.append(ch[i]);
            }

        }
        return sb.toString();
    }
}
//aaABBb
