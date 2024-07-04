package StringBufferI;

public class CapacityStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println("sb: capacity :"+sb.capacity());
        StringBuffer sb1=new StringBuffer("java");
        System.out.println("sb1: java capacity:"+sb1.capacity());
        sb.ensureCapacity(21);
        System.out.println("sb1.in ");
    }
}
