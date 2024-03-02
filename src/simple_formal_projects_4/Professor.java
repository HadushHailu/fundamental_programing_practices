package simple_formal_projects_4;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numOfPublications;

    Professor(){}

    Professor(String name, double salary, LocalDate hireDate, int numOfPublications){
        super(name, salary, hireDate);
        this.numOfPublications = numOfPublications;
    }
    public void setNumOfPublications(int numOfPublications){
        this.numOfPublications = numOfPublications;
    }

    public int getNumOfPublications(){
        return numOfPublications;
    }
    
}
