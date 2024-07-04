package AssignmentIII;

import java.util.Scanner;

public class CountOfWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                int count=1;
                for (int j =i+1; j < arr.length; j++) {
                    if(arr[i].equals(arr[j])){
                        count++;
                        arr[j]=null;
                    }
                }
                System.out.println(arr[i]+" ===> "+count);
            }
        }
    }
}
