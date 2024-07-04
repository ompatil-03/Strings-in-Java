package AssignmentII;

import java.util.Scanner;

public class LastOccurrenceOfWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        System.out.println("Enter the word you want to replace :");
        String ch1=s.next();
        System.out.println("Enter the the replacement word:");
        String ch2=s.next();
        String[] arr=str.split(" ");
        int temp=0;
        System.out.println("The modified string is :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ch1)){
                temp=i;
            }
        }
        System.out.println("The last occurrence of word is at index "+temp);
//        arr[temp]=ch2;
//        for (int a = 0; a < arr.length; a++) {
//            System.out.print(arr[a]+" ");
//        }
    }
}
