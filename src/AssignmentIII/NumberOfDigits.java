package AssignmentIII;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println("The number of digits are :"+count);
    }
}
