package simple_formal_exercise;

public class AbstractTest {
    public static void main(String[] args) {
        ClosedCurve[] closedCurves = {new Triangle(3,3),
                                      new Circle(3),
                                      new Square(4)};
        for(ClosedCurve c: closedCurves)
            System.out.println(c.computeArea());

        Circle circle = new Circle(3);
        //System.out.println(circle.computeArea());
    }

}
