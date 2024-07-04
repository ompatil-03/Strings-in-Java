package AssignmentIII;

import java.util.Scanner;

public class NotSpicalChar {
    public static boolean spical(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        if (spical(str)) {
            System.out.println("String contains special char");
        } else {
            System.out.println("String does NOT contain special char");
        }
    }
}
