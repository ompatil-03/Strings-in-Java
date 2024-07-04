package StringBufferI;

public class ComparesEqualsMethods {
    public static void main(String[] args) {
//        StringBuffer sb1=new StringBuffer("java");
//        StringBuffer sb2=new StringBuffer(sb1);
//        StringBuffer sb3=new StringBuffer("java");
//        System.out.println(sb1.compareTo(sb2));
//        System.out.println(sb1.compareTo(sb3));
//        System.out.println("sb1: "+sb1);
//        System.out.println("After reversing:");
//
//        System.out.println("sb2: "+ sb2.reverse());
//        System.out.println("sb3: "+sb3.reverse());
//        System.out.println("sb1: "+sb1);
//        System.out.println(sb1.compareTo(sb2));
//        System.out.println(sb1.compareTo(sb3));
//        System.out.println("=======================");
//        System.out.println("sb1: "+sb1);
//        System.out.println("sb2: "+sb2.reverse());
//        System.out.println("sb3: "+sb3.reverse());
//        System.out.println(sb1.equals(sb2));
//        System.out.println(sb1.equals(sb3));
        StringBuffer sb=new StringBuffer();
        System.out.println("Empty stringbuffer capacity :"+sb.capacity());
        sb.append("java is programming ");
        System.out.println(sb);
        System.out.println("After adding java is programming capacity: "+sb.capacity());
    }
}
