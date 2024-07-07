package simple_formal_projects_4;

public class Circle extends Shape{
    public double radius;

    /**
     *
     * @param color
     * @param radius
     */
    Circle(String color, double radius){
        super(color);
        this.radius = radius;

    }

    /**
     *
     * @return area
     */
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }

    /**
     *
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}
