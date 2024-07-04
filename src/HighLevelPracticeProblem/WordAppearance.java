package HighLevelPracticeProblem;

import java.util.Scanner;

public class WordAppearance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        String[] ans=new String[n];
        System.out.println("Enter the String inputs:");
        for (int i = 0; i < ans.length; i++) {
            ans[i]=s.next();
        }
        System.out.println("output is :");
        System.out.println(twice(ans));

    }
    public static int twice(String [] s){
        int max=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]!=null){
                int count=0;
                for (int j = i+1; j < s.length; j++) {
                    if (s[i].equals(s[j])){
                        count++;
                        s[j]=null;
                    }
                }
                if(count==1){
                    max++;
                }
            }
        }
        return max;
    }
}
