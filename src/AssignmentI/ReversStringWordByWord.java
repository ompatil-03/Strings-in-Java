package AssignmentI;

import java.util.Scanner;

public class ReversStringWordByWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("The string in revers order word by word is :");
        String[] sArr=str.split(" ");
        for (int i = sArr.length-1; i >=0; i--) {
            System.out.print(sArr[i]+"  ");
        }
    }
}
