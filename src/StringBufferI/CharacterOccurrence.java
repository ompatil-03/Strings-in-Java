package StringBufferI;

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        str=str.toLowerCase();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count=1;
            char ch=str.charAt(i);
            for (int j =i+1; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if (!sb.toString().contains(str.substring(i,i+1))){
                sb.append(count);
                sb.append(ch);

            }
        }
        System.out.println(sb);
    }
}
