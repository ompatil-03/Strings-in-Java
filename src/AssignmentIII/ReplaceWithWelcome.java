package AssignmentIII;

import java.util.Scanner;

public class ReplaceWithWelcome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer();
        String[] arr=str.split(" ");
        System.out.println("The modified String is : ");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==1){
                System.out.print("Welcome ");
            }else {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
