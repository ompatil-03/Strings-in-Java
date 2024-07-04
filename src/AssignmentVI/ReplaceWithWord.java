package AssignmentVI;

import java.util.Scanner;

public class ReplaceWithWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("Enter Old String :");
        String old=s.nextLine();
        System.out.println("Enter new String :");
        String news=s.nextLine();
        System.out.println("The final String is :");
        System.out.println();
        System.out.println(newString(str,old,news));
    }
    public static String newString(String s,String a,String b){
        s=s.replaceAll(a,b);
        return s;
    }
}
