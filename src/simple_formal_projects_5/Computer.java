package simple_formal_projects_5;

import java.util.Objects;

/**
 * @author Hadush
 * @version 0.1
 * @since 21.0
 */
public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    Computer(String manufacturer,
             String processor,
             int ramSize,
             double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }

    /**
     *
     * @return processorSpeed
     */
    public double getProcessorSpeed(){
        return processorSpeed;
    }

    /**
     *
     * @return ramsize * processorSpeed
     */
    public double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Class: Computer Instance variables: manufacturer: " + manufacturer +
                " Processor: " + processor + " RAM size: " + getRamSize() + " ProcessorSpeed: " + getProcessorSpeed();
    }

    @Override
    public boolean equals(Object object){
        if(this == object)
            return true;
        //
        else if(object == null || getClass() != object.getClass()){
            return false;
        }
        Computer computer1 = (Computer) object; //Casting
        return  Objects.equals(manufacturer, computer1.manufacturer) &&
                Objects.equals(processor, computer1.processor) &&
                ramSize == (computer1.getRamSize()) &&
                processorSpeed == (computer1.getProcessorSpeed());

    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, getRamSize(), getProcessorSpeed());
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "Intel", 8, 2.4);
        Computer computer1 = new Computer("MSI", "AMD", 16, 2.4);

        System.out.println(computer.toString());

        //Compare two Computer Objects are equal or not.
        System.out.println(computer.equals(computer1));

        //Print the objects hashCode() value and check the hashCodes are equal or not.
        System.out.println("computer's hashCode: " + computer.hashCode());
        System.out.println("computer1's hashCode: " + computer1.hashCode());
        System.out.println(computer.hashCode() == computer1.hashCode());

        System.out.println(computer.getClass().getSimpleName());
    }
}
