package AssignmentI;

import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("=====================================");
        System.out.println("Ascending Sorting: ");
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].length()>arr[j].length()){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\n=====================================");
        System.out.println("Descending Sorting: ");
        String[] arr2=str.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i].length()<arr2[j].length()){
                    String temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
    }
}
