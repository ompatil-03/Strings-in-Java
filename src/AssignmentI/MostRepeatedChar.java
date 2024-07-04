package AssignmentI;

import java.util.Scanner;

public class MostRepeatedChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        int max=0;
        char ch1=' ';
        for (int i = 0; i < ch.length; i++) {
            int count=0;
          if(ch[i]!='*'){
              for (int j =i+1; j < ch.length; j++) {
                    if(ch[i]==ch[j]){
                        ch[j]='*';
                        count++;
                    }
              }
              if(count>max){
                  max=count;
                  ch1=ch[i];
              }
          }
        }
        System.out.println("The most repeating character is :"+ch1+"\nCount of character is :"+max);
    }
}
