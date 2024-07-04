package AssignmentI;

import java.util.Scanner;

public class RepeatingCharString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        char[] ch1=new char[(ch.length)*2];
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            ch1[count++]=ch[i];
            ch1[count++]=ch[i];
        }
        String str2=new String(ch1);
        System.out.println("The new String is :\n"+str2);

    }
}
