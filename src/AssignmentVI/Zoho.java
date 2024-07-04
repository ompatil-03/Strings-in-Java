package AssignmentVI;

import java.util.Scanner;

public class Zoho {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("the modified string is :g");
        String []ans=str.split(" ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i].charAt(0));
        }
    }
}
