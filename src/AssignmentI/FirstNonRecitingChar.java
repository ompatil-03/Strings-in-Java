package AssignmentI;

import java.util.Scanner;

public class FirstNonRecitingChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        System.out.println("The first non repeating character is :");
        for (int i = 0; i < ch.length; i++) {
            boolean b=true;
            if(ch[i]!='*'){
                for (int j = i+1; j < ch.length; j++) {
                    if(ch[i]==ch[j]){
                        ch[j]='*';
                        b=false;
                    }
                }
                if (b){
                    System.out.println(ch[i]);
                    break;
                }
            }
        }
    }
}
