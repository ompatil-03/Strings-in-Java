package AssignmentIII;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))){
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println("The new String is \n"+sb);
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
