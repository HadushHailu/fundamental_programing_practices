package simple_formal_exercise;

final class Circle extends ClosedCurve{
    final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double computeArea(){
        return Math.PI * radius * radius;
    }
}
