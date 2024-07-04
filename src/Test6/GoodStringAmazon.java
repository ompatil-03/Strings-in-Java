package Test6;

import java.util.Scanner;

public class GoodStringAmazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        int vowel = 0;
        int cons = 0;
        boolean isGoodString = true;

        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowel++;
                cons = 0;
            } else if(Character.isAlphabetic(str.charAt(i))){
                cons++;
                vowel = 0;
            }
            if (vowel > 5 || cons > 3) {
                System.out.println("Bad String !");
                isGoodString = false;
                break;
            }
        }
        if (isGoodString){
            System.out.println("Good String ");
        }


    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
/*Q10. Good or Bad string (Amazon)3
Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more than
3 consonants or more than 5 vowels together. So,
it's a GOOD string.*/


