package AssignmentII;

import java.util.Scanner;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        charFrequency(str);
    }
    public static void charFrequency(String s){

        char ch=' ';
        char[] arr=s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!='*'){
                int count=1;
                for (int j = i+1; j<arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]='*';
                    }
                }
                System.out.println("The frequency of "+s.charAt(i)+" is -->"+count);
            }
        }
    }
}
