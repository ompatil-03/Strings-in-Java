package AssignmentVI;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The Modified string is :"+rearrange(str));
    }
    public static String rearrange(String str){
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                count+=Character.getNumericValue(str.charAt(i));
            }else {
                sb.append(str.charAt(i));
            }
        }
        char[] ch=sb.toString().toCharArray();
        Arrays.sort(ch);
        sb1.append(ch);
        sb1.append(count);
        return sb1.toString();
    }
}
