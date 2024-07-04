package AssignmentIII;

import java.util.Scanner;

public class FindVowelsIII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        String[] arr=str.split(" ");
        System.out.println("The Words start with Vowels: ");
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i].charAt(0))){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
