package Test6;

import java.util.Arrays;

public class NegativePositive {
    public static void main(String[] args) {
        int[] a={-12, 11, -13, -5, 6, -7, 5, -3, -6 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>0 && a[j]<0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The new Array is :\n"+ Arrays.toString(a));
    }
}
