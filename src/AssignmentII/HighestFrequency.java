package AssignmentII;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        High(str);

    }
    public static void High(String s){
        char ch=' ';
        char[] charArray=s.toCharArray();
        int max=0;
        for (int i = 0; i<charArray.length; i++) {
            if(charArray[i]!='*'){
                int count=1;
                for (int j = i+1; j < charArray.length; j++) {
                    if(charArray[i]==charArray[j]){
                        count++;
                        charArray[j]='*';
                    }
                }
                if (count>max){
                    max=count;
                    ch=charArray[i];
                }
            }
        }
        System.out.println("The most repetating character is "+ch+"\ncount is:"+max);
    }
}
