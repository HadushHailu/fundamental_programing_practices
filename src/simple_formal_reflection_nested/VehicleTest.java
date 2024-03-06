package simple_formal_reflection_nested;

public class VehicleTest {
    public static void main(String[] args) {

        //Anonymous inner class on inheritance
        Vehicle vehicle = new Vehicle("Toyota"){
            String modelName = "High Lander";

            public String getModelName(){
                return modelName;
            }

            public void setModelName(String modelName){
                this.modelName = modelName;
            }

            @Override
            public void printSomething(){
                System.out.println("Vehicle: " + name);
            }
        };

        vehicle.printSomething();

        Vehicle vehicle1 = new Vehicle(){
            @Override
            public void printSomething(){
                System.out.println("Vehicle: " + name);
            }
        };

        vehicle1.printSomething();
    }
}
