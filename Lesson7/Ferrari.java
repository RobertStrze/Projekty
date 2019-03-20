package Lesson7;

public class Ferrari extends Car {
    Ferrari(String color ,String fuelType){
        super(color, fuelType);
    }
    @Override
    public void drive(){
        setFuelType("Gasoline");
        //setColor("Red");
        startEngine();
        System.out.println("I'm driving with speed 120km/h");
        //drive();
    }

    protected static void clean(){
        System.out.println("Ferrari is cleaned");
    }
}
