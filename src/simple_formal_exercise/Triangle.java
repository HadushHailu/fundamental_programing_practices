package simple_formal_exercise;

final class Triangle extends ClosedCurve{
    final double base;
    final double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double computeArea(){
        return 0.5*base*height;
    }
}
