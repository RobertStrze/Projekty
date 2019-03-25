package Lesson7;

public class Scania extends Car {
    public Scania(String color, String fuelType) {
        super(color, fuelType);
    }

    @Override
    protected String getFuelType() {
        return super.getFuelType();
    }

    @Override
    protected void setFuelType(String fuelType) {
        super.setFuelType(fuelType);
    }

    @Override
    protected void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void changeTires() {
        System.out.println("Changing tires in my lorry");
    }
    /*@Override //can't use over ride because drive in superclass is a private static method;
    void clean(){
        super.clean();
    }*/

}
