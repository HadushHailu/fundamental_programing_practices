package simple_formal_projects_5;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    SalariedEmployee(String firstName,
                     String lastName,
                     String socialSecurityNumber,
                     double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;

    }
    @Override
    public double getPayment(){
        return weeklySalary;
    }
}
