package LargeAssignment;

import java.util.Arrays;

public class LargestWordInDictionary {
    public static void main(String[] args) {
        String[] arr={"ale", "apple", "monkey", "plea"};
        System.out.println("Array :"+ Arrays.toString(arr));
        String target="abpcplea";
        System.out.println("Target String :"+target);
        String max="";
        for (int i = 0; i < arr.length; i++) {
            if (contains(arr[i],target) && arr[i].length()>max.length() ){
                max=arr[i];
            }
        }
        System.out.println("The answer is :"+max);
    }
    public static boolean contains(String s,String target){
       int count=0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (s.charAt(i)==target.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count==s.length();
    }
}
