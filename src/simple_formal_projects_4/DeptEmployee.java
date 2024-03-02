package simple_formal_projects_4;

import java.time.LocalDate;

/**
 * @author Hadush
 */
public class DeptEmployee {
    private String name;
    protected double salary;
    private LocalDate hireDate;

    /**
     *
     * @param name
     * @param salary
     * @param hireDate
     */
    DeptEmployee(String name, double salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    /**
     * Constructor with no argument
     */
    DeptEmployee(){}

    protected double computeSalary(){
        return salary;
    }
    protected String getName(){
        return this.name;
    }

    protected LocalDate getHireDate(){
        return this.hireDate;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }
}
