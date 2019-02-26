//import java.util.Scanner;

public class Calculator {
    private static int[] fillAges() {
        int[] ages = new int[12];
        ages[0] = 61;
        ages[1] = 31;
        ages[2] = 44;
        ages[3] = 26;
        ages[4] = 65;
        ages[5] = 11;
        ages[6] = 5;
        ages[7] = 47;
        ages[8] = 82;
        ages[9] = 12;
        ages[10] = 16;
        ages[11] = 95;


        return ages;
    }

    public static void main(String[] args) {
        int[] ages = fillAges();
        forLoop(ages);
    }

    private static void forLoop(int[] ages) {
        int x = ages.length + 1;
        for (int n = ages.length - 1; n >= 1; n--) {
            x--;
            if (n == ages.length - 1 && ages[n] > ages[n - 1] && ages[n] >= ages[ages.length - 1]) {
                System.out.println("Peak = " + ages[n]);

            } else if (n != ages.length - 1 && ages[n] > ages[n - 1] && ages[n] > ages[x]) {
                System.out.println("Peak = " + ages[n]);

            } else if (n == 1 && ages[n] < ages[0]) {
                System.out.println("Peak = " + ages[n - 1]);
            }

        }
        System.out.println("Done -- forLoop");
    }

}
