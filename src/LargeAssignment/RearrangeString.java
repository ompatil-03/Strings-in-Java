package LargeAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Rearrenged String is :"+rearrange(str));
    }
    public static String rearrange(String s){
        StringBuilder sb =new StringBuilder();
        StringBuilder sb1 =new StringBuilder();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sum+=Character.getNumericValue(s.charAt(i));
            }else {
                sb.append(s.charAt(i));
            }
        }
        char []ch=sb.toString().toCharArray();
        Arrays.sort(ch);
        //System.out.println(ch);
        sb1.append(ch);
        sb1.append(sum);
        return sb1.toString();
    }
}
