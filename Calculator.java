import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int x = input.nextInt();
        System.out.print("Second Number: ");
        int y = input.nextInt();
        if(y == 0) {
            System.out.println("You can't divide by 0");
        }else{
        System.out.println("x/y= " + div(x, y));
        }
        System.out.println("x*y= " + mul(x, y));
    }
    private static float div(float x, float y){
        return x/y;
    }
    private static int mul(int x, int y){
        return x*y;
    }
}
