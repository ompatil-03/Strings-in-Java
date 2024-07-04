package AssignmentIII;

import java.util.Scanner;

public class ReversWordAtEvenIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                arr[i]=revers(arr[i]);
            }
        }
        System.out.println("The modified String is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static String revers(String s){
        StringBuffer sb=new StringBuffer();
        for (int i =s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
