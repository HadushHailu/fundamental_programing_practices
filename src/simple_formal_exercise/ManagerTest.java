package simple_formal_exercise;

import java.time.LocalDate;
import java.util.Locale;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Hadush", 27900, 2020, 2, 2);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Jimmy", 2300, 2017, 4, 5);
        staff[2] = new Employee("Gidey", 2300, 2017, 4, 5);

        for(Employee e: staff)
            System.out.println(e.getName() + " " + e.getSalary());

    }
}
