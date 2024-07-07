package simple_formal_projects_2;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double computeArea(){
        return ((double) 1 /2 * base * height);
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
}
