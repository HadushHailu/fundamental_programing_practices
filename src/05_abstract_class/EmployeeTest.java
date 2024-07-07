package simple_formal_projects_5;

import java.util.Arrays;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new CommissionEmployee("Hadush", "Hailu", "US674", 30000, 0.3);
        employees[1] = new HourlyEmployee("Ruth","Mezgebe", "US546", 58, 160);
        employees[2] = new BasePlusCommissionEmployee("Alemu", "Welday", "US787", 40000, 0.2, 2000);
        employees[3] = new SalariedEmployee("Tom", "Bob", "US980", 10000);
        employees[4] = new SalariedEmployee("Alex", "Hadera", "US234", 800);

        //1
        for(Employee emp: employees)
            System.out.println(emp.getPayment());

        //2
        for(Employee emp: employees)
            System.out.println(emp.toString());

        //3
        double sum = 0;
        for(Employee e: employees){
            sum += e.getPayment();
        }

        System.out.print(sum);


    }
}
