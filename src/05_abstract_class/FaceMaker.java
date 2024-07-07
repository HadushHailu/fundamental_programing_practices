package simple_formal_projects_5;

public class FaceMaker implements IFigure{
    private final String strFigure;

    FaceMaker(){strFigure = ":)";}

    @Override
    public void getFigure(){
        System.out.print(strFigure);
    }
}
