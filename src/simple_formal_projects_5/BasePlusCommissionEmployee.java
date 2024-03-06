package simple_formal_projects_5;


public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;


    /**
     * @author Hadush
     * @since 1.2
     * @version 0.1
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param grossSalary
     * @param commissionRate
     * @param baseSalary
     * @return no
     */
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
