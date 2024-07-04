package AssignmentIII;

import java.util.Scanner;

public class AntiClockwiseRotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        char temp=str.charAt(str.length()-1);
        for (int i =ch.length-1; i>0; i--) {
            ch[i]=ch[i-1];
        }
        ch[0]=temp;
        System.out.println("The new string is :"+(new String(ch)));
    }
}
