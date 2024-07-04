package StringBufferI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LexithographicSorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(!sb.toString().contains(str.substring(i,i+1))){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        char[] ch=sb.toString().toCharArray();
        System.out.println((sb.toString().compareTo(sb.toString())));
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

    }
}
