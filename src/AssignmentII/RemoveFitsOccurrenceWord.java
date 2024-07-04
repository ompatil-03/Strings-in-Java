package AssignmentII;

import java.util.Scanner;

public class RemoveFitsOccurrenceWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        System.out.println("Enter the word you want to check:");
        String ch1=s.next();
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ch1)){
                arr[i]="";
                break;
            }
        }
        System.out.println("The new String is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
