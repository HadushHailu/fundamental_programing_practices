package simple_formal_projects_5;

public class UpwardHat implements IFigure{
    private final String strFigure;

    UpwardHat(){
        this.strFigure = "/\\";
    }
    @Override
    public void getFigure(){
        System.out.print(strFigure);
    }
}
