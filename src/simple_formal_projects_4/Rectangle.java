package simple_formal_projects_4;

/**
 * @author Hadush
 */
public class Rectangle extends Shape {
    /**
     * Instance fields
     */
    protected double width;
    protected double height;

    /**
     * @param color
     * @param width
     * @param height
     */
    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return area
     */
    @Override
    public double calculateArea(){
        return width * height;
    }

    /**
     *
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return 2*(width + height);
    }
}

