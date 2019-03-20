package Lesson7;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("Blue", "LPG");
        Ferrari ferrari = new Ferrari("Red", "Gasoline");

        car.drive();
        ferrari.drive();

        car.clean();
        ferrari.clean();
    }
}
