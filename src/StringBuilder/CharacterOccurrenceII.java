package StringBuilder;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CharacterOccurrenceII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        str= str.toLowerCase();
        int temp=0;
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j=i; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
                else {
                    i=j-1;
                    break;
                }

            }
            sb.append(str.charAt(i));
            sb.append(count);

        }
        System.out.println("The Output is :");
        System.out.println(sb);
    }
}
