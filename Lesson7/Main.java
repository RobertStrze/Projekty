package Lesson7;

public class Main{
    public static void main(String[] args) {
        Car car = new Car("Red","Gasoline");
        Ferrari ferrari = new Ferrari("Black", "Rocket Fuel");
        Scania scania = new Scania("White", "Diesel");

        car.changeTires();
        ferrari.changeTires();
        scania.changeTires();

        Car carFerrari = new Ferrari("Red", "Rocket Fuel");
        Car carScania = new Scania("Black", "addBlue");

        carFerrari.changeTires();
        carScania.changeTires();
    }
}
