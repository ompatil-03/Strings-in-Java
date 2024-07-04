package AssignmentI;

/*Q2.Write a Java program to find highest frequency character in a string.
 */

import java.util.Scanner;

public class Test

{

    public static void highFrequescy()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        str.lastIndexOf('a');

        char s[]=str.toCharArray();
        int cnt=0;int max=0;
        char maxChar = '\0';
        for(int i=0;i<s.length;i++)
        {
            cnt=1;
            for(int j=i+1;j<s.length;j++)
            {
                if(s[i]==s[j])
                {
                    cnt++;
                    s[j]='\0';
                }
            }

            if(s[i]!='\0')
            {
                //System.out.println(s[i]+":"+"count:"+cnt);
                if(cnt>max)
                {
                    max=cnt;
                    maxChar=s[i];
                }

            }
        }
        System.out.println(max);
        System.out.println("Highest frequency character: " +maxChar);



    }
    public static void main(String[] args)
    {
        Test.highFrequescy();
    }

}
