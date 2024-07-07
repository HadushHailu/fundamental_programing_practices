package simple_formal_projects_2;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double computeArea(){
        return width * length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }


}
