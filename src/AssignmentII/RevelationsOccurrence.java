package AssignmentII;

import java.util.Scanner;

public class RevelationsOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter the char:");
        char ch=s.next().charAt(0);
        int ind=str.lastIndexOf(ch);
        System.out.println("============================");
        for (int i = 0; i < str.length(); i++) {
            if(i==ind){
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}
