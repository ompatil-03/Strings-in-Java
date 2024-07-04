package Test6;

import java.util.Scanner;

public class MinimumDistanceBetweenTwoWords {
    public static void main(String[] args) {

        String [] arr={"geeks", "for", "geeks", "contribute",  "practice"};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a first word :");
        String str1=s.nextLine();
        System.out.println("Enter second word :");
        String str2=s.nextLine();
        int num1=0,num2=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (str1.equals(arr[i])){
                num1=i;
            }
            if (str2.equals(arr[i]) && count<=0){
                num2=i;
                count++;
            }

        }
        System.out.println("The minimum distance is :"+(num2-num1));

    }
}
