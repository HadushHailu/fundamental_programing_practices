package simple_formal_projects_5;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    BasePlusCommissionEmployee(String firstName,
                               String lastName,
                               String socialSecurityNumber,
                               double grossSalary,
                               double commissionRate,
                               double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSalary,commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment(){
        return baseSalary + (getGrossSales() + getCommissionRate());
    }
}
