package AssignmentVI;

import java.util.Scanner;

public class LastMatch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        System.out.println("Enter String you want to check last Occurrence of :");
        String ocur=s.nextLine();
         str=str.replaceAll(ocur,"0");
         int ans=0,count=-1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0'){
                count++;
                ans=i;
            }
        }
        ans=ans+count*ocur.length();
        System.out.println(ans);
    }
}
//abcdefghijklghifghsd  ghi
//abcdefompabcdomp omp
