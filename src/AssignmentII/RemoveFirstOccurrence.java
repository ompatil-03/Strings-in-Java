package AssignmentII;

import java.util.Scanner;

public class RemoveFirstOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        System.out.println("Enter character :");
        char ch=s.next().charAt(0);
        System.out.println("The new String is :");
        int ind=str.indexOf(ch);
        for (int i = 0; i < str.length(); i++) {
            if(ind==i){
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}
