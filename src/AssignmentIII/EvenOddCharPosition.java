package AssignmentIII;

import java.util.Scanner;

public class EvenOddCharPosition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        System.out.println("Char at even position :");
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0){
                System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println("\nChar at odd position :");
        for (int i = 0; i < str.length(); i++) {
            if (i%2==1){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
