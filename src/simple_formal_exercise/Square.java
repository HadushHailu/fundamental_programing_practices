package simple_formal_exercise;

final public class Square extends ClosedCurve{
    final double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double computeArea(){
        return side*side;
    }
}

