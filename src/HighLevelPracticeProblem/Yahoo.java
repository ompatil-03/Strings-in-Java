package HighLevelPracticeProblem;
//Q9. Change the string (yahoo)
//        Input:
//        S ="abCD"
//        Output: abcd
//        Explanation: The first letter (a) is
//        lowercase. Hence, the complete string
//        is made lowercase
import java.util.Scanner;

public class Yahoo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        System.out.println("The modified String is :");
        System.out.println(yahoo(str));
    }
    public static String yahoo(String s){
        if (Character.isUpperCase(s.charAt(0))){
            s=s.toUpperCase();
        }else {
            s=s.toLowerCase();
        }
        return s;
    }
}
