package AssignmentI;

import java.util.Scanner;

public class FirstsVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("The word starts wiht vowels are : ");
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(isVowel(arr[i].charAt(0))){
                System.out.print(arr[i]+"  ");
            }
        }
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
