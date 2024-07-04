package StringBasicsII;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        char[] ch=s1.toCharArray();
        System.out.println("The character array is :\n"+ Arrays.toString(ch));
        s1= s1.replaceAll("Java","Lava");
        System.out.println(s1);

    }
}
