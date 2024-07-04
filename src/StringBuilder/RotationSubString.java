package StringBuilder;

import java.util.Scanner;

public class RotationSubString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=s.nextLine();
        System.out.println("Enter a string");
        String str2=s.nextLine();
        if(isSubStringI(str1,str2)){
            System.out.println("Yes !The givens string is rotation of another string !");
        }else {
            System.out.println("NO !The given string is not rotation of another string !");
        }

    }
    //Automatic
    public static boolean isSubString(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        s1=s1.concat(s1);
        return s1.contains(s2);
    }
    //Manuel
    public static boolean isSubStringI(String s1,String s2){
        char[] ch=s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
              ch=rotation(ch);
              if (s2.equals(new String(ch))){
                  return true;
              }
        }
        return false;
    }
    public static char[] rotation(char[] ch){
        char temp=ch[ch.length-1];
        for (int i = ch.length-1; i>0; i--) {
            ch[i]=ch[i-1];
        }
        ch[0]=temp;
        return ch;
    }
}
