package AssignmentII;

import java.util.Scanner;

public class LastOccuranceOf {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("Enter the character you want to check last occurane of:");
        char ch=s.next().charAt(0);
        System.out.println(str.lastIndexOf(ch));
    }
}
