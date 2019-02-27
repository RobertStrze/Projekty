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
        arrElements(ages);
        peaks(ages);
        minValue(ages);
    }

    private static void peaks(int[] ages) {
        System.out.println("--------------------------------------------------");
        for (int n = ages.length - 1; n >= 1; n--) {
            if (n == ages.length - 1 && ages[n] > ages[n - 1] && ages[n] >= ages[ages.length - 1]) {
                System.out.println("Peak Value = " + ages[n]);

            } else if (n != ages.length - 1 && ages[n] > ages[n - 1] && ages[n] > ages[n+1]) {
                System.out.println("Peak Value = " + ages[n]);

            } else if (n == 1 && ages[n] < ages[0]) {
                System.out.println("Peak Value = " + ages[n - 1]);
            }

        }
        System.out.println("--------------------------------------------------");
    }

    private static void minValue(int[] ages) {
        int min = 250;
        for (int i = 0; i < ages.length - 1; i++) {
            if (min > ages[i]) {
                min = ages[i];
            }
        }
        System.out.println("Minimum value = " + min);
    }

    private static void arrElements(int[] ages) {
        System.out.print("Array Elements: ");
        for (int i = ages.length -1; i >=0 ; i--) {
            System.out.print(ages[i] + " ");
        }
        System.out.println();
    }

}
