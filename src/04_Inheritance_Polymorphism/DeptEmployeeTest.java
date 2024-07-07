package simple_formal_projects_4;

import java.time.LocalDate;
import java.util.Scanner;

public class DeptEmployeeTest {

    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = new DeptEmployee[5];
        deptEmployees[0] = new Professor("Hadush", 11000, LocalDate.of(2020, 1,12), 120);
        deptEmployees[1] = new Professor("Hailu", 9000, LocalDate.of(2019,3,17), 2);
        deptEmployees[2] = new Secretary("Okulu", 2700, LocalDate.of(2014, 5, 19), 12);
        deptEmployees[3] = new Professor("Lwam", 17000, LocalDate.now(), 1);
        deptEmployees[4] = new Secretary("Meaza", 2800, LocalDate.of(2010, 2, 2), 100);

        String pressKey;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all Professors and Secretaries salary? press Y if yes." );
        pressKey = scanner.nextLine();

        switch (pressKey){
            case "Y":
                double sum = 0;
                for(DeptEmployee employee: deptEmployees){
                    sum += employee.computeSalary();
                }
                System.out.println("Total salary is: \u0024" + sum);
                break;
            case "N":
                System.out.println("Sure! Bye!");
                break;
            default:
                System.out.println("Bye! Have good day!");
        }


    }
}
