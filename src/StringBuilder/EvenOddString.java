package StringBuilder;

import StringBufferI.CharacterOccurrence;

import java.util.Scanner;

public class EvenOddString
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count=1;
            char ch=str.charAt(i);
            for (int j =i+1; j < str.length(); j++) {
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if (!sb.toString().contains(str.substring(i,i+1))){
                sb.append(ch);
                sb.append(count);
            }
        }
        int even=0,odd=0;
        for (int i = 0; i < sb.length(); i++) {
            int value=(int)(sb.charAt(i));
            if (value%2==0&& Character.getNumericValue(sb.charAt(++i))%2==0){
                even++;
            }
            if (value%2==1 && Character.getNumericValue(sb.charAt(++i))%2==1){
                odd++;
            }
            i++;
        }
        System.out.println("-------------------------------");
        if ((even+odd)%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println("The value of X is : "+even);
        System.out.println("The value of Y is : "+odd);
        }

    }