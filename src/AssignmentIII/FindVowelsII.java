package AssignmentIII;

public class FindVowelsII {
    public static void main(String[] args) {
        String str="Hello India";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))){
                System.out.print(" ");
            }
            if(isVowel(str.charAt(i))){
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
