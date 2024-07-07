package simple_formal_projects_4;

/**
 * @author Hadush
 */
public class TestShape {
    /**
     *
     * @param shapes
     */
    public static void printTotal(Shape[] shapes){
        for(Shape shape: shapes){
            System.out.println("Shape area: " + shape.calculateArea() + " perimeter: "+ shape.calculatePerimeter());
        }
    }

    public static void main(String[] args) {
        //Five shape object holder - array
        Shape[] shapes = new Shape[5];
        shapes[0] = new Shape("red");
        shapes[1] = new Rectangle("Orange", 3, 4);
        shapes[2] = new Circle("Yellow",1);
        shapes[3] = new Square("Blue", 4);
        shapes[4] = new Rectangle("Black", 5,2);

        printTotal(shapes);


    }
}
