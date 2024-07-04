package StringBufferI;

import java.util.Scanner;

public class LongestCommonSubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String 1 :");
        String str1 = s.nextLine();
        System.out.println("Enter a String  2:");
        String str2 = s.nextLine();

        StringBuffer sb = new StringBuffer(common(str1,str2));
        StringBuffer sb2 = new StringBuffer(common(str2,str1));
         String ans=(sb.length()>sb2.length())?subStr(sb,sb2):subStr(sb2,sb);
        System.out.println(ans);



    }
    public static String common(String a,String b){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            boolean con = false;
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    con = true;
                    break;
                }
            }
            if (con ) {
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String subStr(StringBuffer sb,StringBuffer sb2){
        StringBuilder sb3=new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j <sb2.length() ; j++) {
                if (sb.charAt(i)==sb2.charAt(j) && i>=j  && !sb3.toString().contains(sb.substring(i,i+1))){
                    sb3.append(sb.charAt(i));
                }
            }
        }
        return sb3.toString();
    }
}
//ABCDGH  CZYAH  AEDFHR 2 AGGTAB  GXTXAYB