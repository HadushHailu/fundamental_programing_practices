package simple_formal_exercise;

import java.time.LocalDate;
import java.util.Locale;

public class ManagerTest {
    private String name;

    ManagerTest(){}
    ManagerTest(String name){
        this.name = name;
    }

    public String getName(){return name;}

    public static void main(String[] args) {
        Manager boss = new Manager();
        boss.setBonus(5000);

        Employee[] staff = new Employee[4];
        staff[0] = boss;
        staff[1] = new Employee("Jimmy", 2300, 2017, 4, 5);
        staff[2] = new Employee("Gidey", 2300, 2017, 4, 5);
        CEO ceo = new CEO();
        staff[3] = ceo;

        for(Employee e: staff)
            System.out.println(e.getName() + " " + e.getSalary());

        System.out.println(ceo.getEmployee().getSalary());

        ManagerTest managerTest  = new ManagerTest();
        System.out.println(managerTest.getName());


    }
}
