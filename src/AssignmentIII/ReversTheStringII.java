package AssignmentIII;

import java.util.Scanner;

public class ReversTheStringII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        String[] arr=str.split(" ");
        for (int i =arr.length-1; i >=0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println("The new String is :\n"+sb);
    }
}
