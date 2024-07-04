package AssignmentIII;

import java.util.Scanner;

public class ReplaceEvenWithHash {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(i%2==1){
                sb.append(str.charAt(i));
            }else {
                sb.append("#");
            }
        }
        System.out.println("The modified string is :\n"+sb);
    }
}
