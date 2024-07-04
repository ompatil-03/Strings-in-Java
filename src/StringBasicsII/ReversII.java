package StringBasicsII;

public class ReversII {
    public static void main(String[] args) {
        String s="Let's program a code in java.";
        String []str=s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i]=revers(str[i]);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    private static String revers(String s) {
        char ch[]=s.toCharArray();
        char ch1[]=new char[ch.length];
        int count=0;
        for (int i =ch.length-1; i >=0 ; i--) {
            ch1[count++]=ch[i];
        }
        return new String(ch1);
    }
}
