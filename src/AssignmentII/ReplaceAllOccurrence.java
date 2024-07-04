package AssignmentII;

import java.util.Scanner;

public class ReplaceAllOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        System.out.println("Enter the character you want to replace :");
        char ch1=s.next().charAt(0);
        System.out.println("Enter the the replacement char:");
        char ch2=s.next().charAt(0);
        System.out.println("The modified string is :");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch1){
                System.out.print(ch2);
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
