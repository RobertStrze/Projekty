package Lesson7;

public class Car implements Vehicle {
    private String color;
    private String fuelType;

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    protected String getFuelType() {
        return fuelType;
    }

    protected void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    Car(String color, String fuelType){
        this.color = "Black";
        this.fuelType = "Gasoline";
    }

    protected void startEngine(){
        System.out.println("Engine Started");
    }
    protected static void clean(){
        System.out.println("Car is cleaned");
    }

    @Override
    public void drive() {
        startEngine();
        System.out.println("I'm driving with speed 50km/h");
    }
}
