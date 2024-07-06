package HighLevelPracticeProblem;

import java.util.Scanner;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder();
        char c[] = str.toCharArray();
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < c.length; i++) {
            int count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    c[j]='*';
                }
            }
            if(c[i]!='*'){
                sb.append(count);
                sb.append(c[i]);
            }
        }
        int count=0;
        int temp=0;
        for (int i = 0; i < sb.length(); i+=2) {
            if(i>max){
                secMax=max;
                max=i;
                temp=i;
            } else if (i>secMax &&i!=max) {
                secMax=i;

            }
            count++;
        }
        System.out.println(sb);
        System.out.println(sb.charAt(temp));
        System.out.println(sb.charAt(count));
        System.out.println(sb.charAt(secMax+1));
    }
}
/*19. Write a program that takes in a string and returns the second most frequent character
in it.*/

