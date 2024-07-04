package AssignmentVI;

import java.util.*;
public class DifficultSentence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        String[] arr=str.split(" " );
        int hard=0,easy=0;
        for(int i=0;i<arr.length;i++) {
            if(difficult(arr[i])) {
                hard++;
            }else {
                easy++;
            }
        }
        int diff=5*hard+3*easy;
        System.out.println("The difficulty is: "+diff);
    }
    public static boolean difficult(String s) {
        int vowel=0,cons=0;
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(isVowel(s.charAt(i))) {
                count=0;
                vowel++;
            }else {
                count++;
                cons++;
            }
            if(count==3) {
                return true;
            }
        }
        return cons>vowel;
    }
    public static boolean isVowel(char ch) {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
