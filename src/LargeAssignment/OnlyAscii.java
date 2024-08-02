package LargeAssignment;

import java.util.Scanner;

public class OnlyAscii {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        if (containsOnlyASCII(str)) {
            System.out.println("The string contains only ASCII characters.");
        } else {
            System.out.println("The string contains non-ASCII characters.");
        }
    }

    public static boolean containsOnlyASCII(String str) {
        for (char c : str.toCharArray()) {
            if (c > 127) {
                return false;
            }
        }
        return true;
    }
}
