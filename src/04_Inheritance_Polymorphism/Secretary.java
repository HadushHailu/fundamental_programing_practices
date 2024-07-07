package simple_formal_projects_4;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overTimeHours;

    Secretary(){}

    Secretary(String name, double salary, LocalDate hireDate,
              double overTimeHours){
        super(name, salary, hireDate);
        this.overTimeHours = overTimeHours;

    }
    @Override
    public double computeSalary(){
        return this.salary + 12*overTimeHours;
    }
    public void setOverTimeHours(double overTimeHours){
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeHours(){
        return overTimeHours;
    }
}
