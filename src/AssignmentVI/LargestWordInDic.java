package AssignmentVI;

import StringBasics.StringI;

public class LargestWordInDic {
    public static void main(String[] args) {
        String[] str={"ale", "apple", "monkey", "plea"};
        String input="abpcplea";
        int max=0;
        String ouput="";

        for (int i = 0; i < str.length; i++) {
            boolean b=true;
            for (int j = 0; j < str[i].length(); j++) {
                if (!input.contains(str[i].subSequence(j,j+1))){
                    b=false;
                }
            }
            if (b){
                if (str[i].length()>max){
                    max=str[i].length();
                    ouput=str[i];
                }
            }
        }
        System.out.println(ouput);
    }
}
