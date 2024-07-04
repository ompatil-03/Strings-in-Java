package AssignmentI;

public class PatternPrint {

    public static void main(String[] args) {
        printPattern();
    }
    public static void printPattern() {
        int num = 1;
        boolean oddRow = true;

        for (int i = 1; i <= 5; i++) {
            if (oddRow) {
                for (int j = 0; j < i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                int startNum = num + i - 1;
                for (int j = 0; j < i; j++) {
                    System.out.print(startNum + " ");
                    startNum--;
                    num++;
                }
            }

            oddRow = !oddRow;
            System.out.println();
        }
    }
}


