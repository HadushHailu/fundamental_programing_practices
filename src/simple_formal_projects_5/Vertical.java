package simple_formal_projects_5;

public class Vertical implements IFigure{
    private final String strFigure;

    Vertical(){ strFigure = "||";}

    @Override
    public void getFigure(){
        System.out.print(strFigure);
    }
}
