package StringBufferI;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        StringBuffer sb=new StringBuffer(s.next());
        System.out.println("String 1:"+sb);
        StringBuffer sb1=new StringBuffer("Hello");
        System.out.println("String 2:"+sb1);

        sb.setCharAt(1,'*');
        System.out.println("SetCharAt: "+sb);
        System.out.println("Append method: "+sb.append("Programming"));
        System.out.println("capacity method: "+sb.capacity());
        System.out.println("compare to :"+ sb.compareTo(sb));
        System.out.println("revers Method: "+sb.reverse());
        System.out.println("replace Method: "+ sb.replace(0,5,"Happy"));
        System.out.println("delete Method: "+sb.delete(2,7));

        System.out.println("substring Method:"+sb.substring(0,2));
        System.out.println("is empty Method: "+sb.isEmpty());
        System.out.println("is equals Method: "+sb.equals(sb1));

    }
}
