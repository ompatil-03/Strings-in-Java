package AssignmentVI;

import java.util.Scanner;

public class SameCharInTwoStrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String ans1=s.nextLine();
        ans1=ans1.toLowerCase();
        System.out.println("Enter a String 2:");
        String ans2=s.nextLine();
        ans2=ans2.toLowerCase();
        int count=0;
        for (int i = 0; i < ans1.length(); i++) {
            if(ans2.charAt(i)==ans1.charAt(i)){
                count++;
            }
        }
        System.out.println("The answer is :"+count);
    }
}
// choice  chancE