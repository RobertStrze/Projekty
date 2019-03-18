public class Ferrari {
    public static String color;
    private int horsePower;
    public final String plateNumber;

    public Ferrari() {
        color = "Black";
        horsePower = 425;
        plateNumber = "JAVA2019";
    }

    public static void main(String[] args) {
        Ferrari car = new Ferrari();
        car.SetColor("Red");
        car.SetHorsePower(450);
        //car.SetPlateNumber("JAVA1234"); // Can't assign a new value to final variable.
        car.color = "Pink";
        car.horsePower = 385;
        // car.plateNumber = "JAVA1234"; // You can't change final variable value.
        Ferrari.color = "Yellow";
        SetColor(); // Overload method.
        //Ferrari.horsePower = 520; // Non-static field can't be referenced from static context.
        //Ferrari.plateNumber = "JAVA1234"; // Non-static field can't be referenced from static context.
        System.out.println("Horsepower: " + car.GetHorsePower());
        System.out.println("Color: " + car.GetColor());
        System.out.println("Plate Number: " + car.GetPlateNumber());
    }

    static void SetColor(String newColor) {
        color = newColor;
    }
    static String SetColor(){
        color = "Gold";
        return color;
    }

    static String GetColor() {
        return color;
    }


    void SetHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    int GetHorsePower() {
        return horsePower;
    }

    /*final void SetPlateNumber(String newPlateNumber) {
        plateNumber = newPlateNumber;
    }*/

    final String GetPlateNumber() {
        return plateNumber;
    }


}
