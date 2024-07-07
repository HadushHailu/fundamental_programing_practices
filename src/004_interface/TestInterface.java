package simple_formal_interface;

public class TestInterface {
    public static void main(String[] args) {
        InterfaceClosedCurve[] shapes = { new Circle(4.0)};

        for(InterfaceClosedCurve c: shapes){
            double res = c.computeArea();
            System.out.println(res);
        }
    }
}
