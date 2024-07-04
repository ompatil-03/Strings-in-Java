package AssignmentIII;

import java.util.Scanner;

public class ClockwiseRotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        char temp=str.charAt(0);
        for (int i = 0; i < ch.length-1; i++) {
            ch[i]=ch[i+1];
        }
        ch[ch.length-1]=temp;
        System.out.println("The new string is :"+(new String(ch)));
    }
}
