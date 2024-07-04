package Test6;

public class pattern {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=7; i++) {
            for (int j =7; j>=i; j--) {
                System.out.print(" ");
            }
            int count=i;
            for (int j =1; j <=i; j++) {
                System.out.print(count--);
            }
            for (int j =2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
