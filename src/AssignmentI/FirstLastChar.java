package AssignmentI;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("The modified string is :");
        if (str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println(str.substring(1,str.length()-1));
        }else {
            System.out.println(str);
        }
    }
}
