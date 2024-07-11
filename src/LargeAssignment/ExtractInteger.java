package LargeAssignment;

import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The Extracted Integers are :"+extract(str));
    }
    public static String extract(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
            if (Character.isDigit(s.charAt(i))&& Character.isDigit(s.charAt(i+1))){
                sb.append(s.charAt(i));
                sb.append(s.charAt(i+1));
                sb.append(" ");
                i++;
            }else if(Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}
//"1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56"
