package simple_formal_projects_5;

import java.util.Arrays;

public class FigureTest {
    public static void main(String[] args) {
        IFigure[] iFigures = new IFigure[5];
        iFigures[0] = new UpwardHat();
        iFigures[1] = new UpwardHat();
        iFigures[2] = new DownwardHat();
        iFigures[3] = new FaceMaker();
        iFigures[4] = new Vertical();

        for(IFigure fig: iFigures)
            fig.getFigure();

        for(IFigure fig: iFigures){
            String name = fig.getClass().getName();
            System.out.print("\n" + name.split("\\.")[1] + ": ");
            fig.getFigure();
        }

    }
}
