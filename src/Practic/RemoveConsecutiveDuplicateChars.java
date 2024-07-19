package Practic;


import java.util.Scanner;

public class RemoveConsecutiveDuplicateChars {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("The new String is :\n"+consecutive(str));
    }
    public static String consecutive(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i<s.length()-1){
                if (s.charAt(i)!=s.charAt(i+1)){
                    sb.append(s.charAt(i));
                }else {
                    sb.append(s.charAt(i));
                    i++;
                }
            }else {
                if (s.charAt(i-1)!=s.charAt(i)){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
// input:jaavaa
//output:java
