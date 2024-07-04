package AssignmentII;

import java.util.Scanner;

public class RemoveLastOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("Enter the character you want to check last occurane of:");
        char ch=s.next().charAt(0);
        int ind=str.lastIndexOf(ch);
        for (int i = 0; i < str.length(); i++) {
            if (i==ind){
                continue;
            }
            System.out.print(str.charAt(i));
        }

    }
}
