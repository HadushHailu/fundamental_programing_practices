package simple_formal_deep_concepts;


import java.util.Arrays;


interface MyInterface2{
     int method2(int x, int y, int z);
}

@FunctionalInterface
interface MyInterface3{
    String printDetails(Vehicle v);
}

class Vehicle{
    private String name;
    private double price;

    Vehicle(String name,
            double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        MyInterface2 l = (x,y,z) -> {
            return x+y+z;
        };
        System.out.println(l.method2(1,2,3));

        //Lambda expression
        MyInterface3 l2 = v -> v.getName() + " " + v.getPrice();


        //anonymous inner class
        MyInterface3 myInterface3 = new MyInterface3() {
            @Override
            public String printDetails(Vehicle v) {
                return v.getName() + " " + v.getPrice();
            }
        };

        System.out.println(l2.printDetails(new Vehicle("Toyota", 12000)));
        System.out.println(myInterface3.printDetails(new Vehicle("Audi", 300)));

        int[] ints = new int[4];
        ints = new int[] {2,3,4,5,1};
        System.out.println(Arrays.toString(ints) + ints.length);

        int[] ints1 = new int[10];
        //
        System.arraycopy(ints, 0, ints1, 0, ints.length);
        Arrays.sort(ints1);
        System.out.println(Arrays.toString(ints1));

        double[] doubles = new double[10];
        System.out.println(Arrays.toString(doubles));
    }
}
