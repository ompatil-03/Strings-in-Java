package HighLevelPracticeProblem;
import java.util.*;
public class SecondMostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        mostFrequent(str);

    }
    public static void mostFrequent(String s){
        char [] str=s.toCharArray();
        int max=0,secMax=0;
        char ch=' ',tem=' ';
        for (int i = 0; i < str.length; i++) {
            int count=0;
            for (int j = i+1; j < str.length; j++) {
                if (str[i]==str[j]){
                    count++;
                    str[j]='*';
                }
            }
            if (str[i]!='*'&& count>max){
                secMax=max;
                max=count;
                ch=tem;
                tem=str[i];
            }else if (str[i]!='*'&&count>secMax &&count!=max){
                secMax=count;
                ch=str[i];
            }
        }
        System.out.println("The second most freqent char is : "+ch);
    }
}

