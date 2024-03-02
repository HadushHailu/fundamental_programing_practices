package simple_formal_exercise;

public class MyCar extends MyVehicle{
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
        // Create a myCar object
        MyCar myCar = new MyCar();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}
