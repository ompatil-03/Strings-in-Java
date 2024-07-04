package StringBasicsII.Practice;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1=s.nextLine();
        char[] ch=s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='*'){
                int count=1;
                System.out.print("The frequency of "+ch[i]+" is : ");
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i]==ch[j] ){
                        count++;
                        ch[j]='*';
                    }
                }
                System.out.println(count);
            }
        }
    }
}
