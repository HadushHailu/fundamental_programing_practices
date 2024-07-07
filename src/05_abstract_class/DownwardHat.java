package simple_formal_projects_5;

public class DownwardHat implements IFigure{
    private final String strFigure;

    DownwardHat(){
        strFigure = "\\/";
    }

    @Override
    public void getFigure(){
        System.out.print(strFigure);
    }
}
