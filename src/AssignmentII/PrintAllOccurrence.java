package AssignmentII;

import java.util.Scanner;

public class PrintAllOccurrence
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        System.out.println("Enter the character you want to check :");
        String ch1=s.next();
        int ans= str.indexOf(ch1);
        String[] arr=str.split(" ");
        System.out.println("The Word is present at index :");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ch1)){
                System.out.print(i+"  ");
                count++;
            }
        }
        System.out.println("\nThe count of given word is :"+count);
    }
}
