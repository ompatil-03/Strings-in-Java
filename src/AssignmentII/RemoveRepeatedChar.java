package AssignmentII;

import java.util.Scanner;

public class RemoveRepeatedChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = s.nextLine();
        repeted(str);
    }

    public static void repeted(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '*') {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = '*';
                    }
                }
            }
        }
        System.out.println("The new string is :");
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] != '*') {
                System.out.print(ch[j]);
            }
        }
    }
}
