package LargeAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequencyChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
frequent(str);
    }
    public static void frequent(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else {
                hm.put(s.charAt(i),1);
            }
        }
        Integer max=0;
        char ch=' ';
        for (Map.Entry<Character,Integer>e: hm.entrySet()){
            if (max<e.getValue()){
                max=e.getValue();
                ch=e.getKey();
            }
        }
        System.out.println("The most frequent char is :" +ch);
    }
}
