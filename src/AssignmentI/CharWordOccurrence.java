package AssignmentI;

import java.util.Scanner;

public class CharWordOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        String[] arr1=str.split(" ");
        char firstChar=str.charAt(0);
        char lastChar=str.charAt(str.length()-1);
        String fistWord=arr1[0];
        String lastWord=arr1[arr1.length-1];
        System.out.println("The first word ["+fistWord+"] count is :"+wordOccurrence(arr1,fistWord));
        System.out.println("The last word ["+lastWord+"] count is :"+wordOccurrence(arr1,lastWord));
        System.out.println("The first character ["+firstChar+"] count is :"+charOccurrence(ch,firstChar));
        System.out.println("The last character ["+lastChar+"] count is :"+charOccurrence(ch,lastChar));
    }
    public static int charOccurrence(char[] ch, char ch1){
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==ch1){
                count++;
            }
        }
        return count;
    }
    public static int wordOccurrence(String[] s,String s1){
        int count=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(s1)){
                count++;
            }
        }
        return count;
    }
}
