package StringBasicsII;

import java.util.Scanner;

public class EqualsEqualOperatorComparator {
    public static void main(String[] args) {
        System.out.println("Enter string 1:");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter string 2:");
        String s2=s.nextLine();
        System.out.println("By using equals to operator :");
        equalsOp(s1,s2);
        System.out.println("------------------------------");
        System.out.println("By using equalTo Method:");
        equalsTo(s1,s2);
        System.out.println("------------------------------");
        System.out.println("By using compare-To method");
        compareTo(s1,s2);

    }
    public static void equalsOp(String s1,String s2){
        if (s1==s2){
            System.out.println("The both strings are equal.");
        }else {
            System.out.println("The both strings are NOT equal");
        }
    }
    public static void equalsTo(String s1,String s2){
        if (s1.equals(s2)){
            System.out.println("The both strings are equal.");
        }else {
            System.out.println("The both strings are NOT equal");
        }
    }
    public static void compareTo(String s1,String s2){
        if (s1.compareTo(s2)>0){
            System.out.println("The string S1 is greater then S2");
        }else if (s1.compareTo(s2)<0){
            System.out.println("The string S2 is greater then S1");
        }else {
            System.out.println("Both strings are equal");
        }

    }
}
