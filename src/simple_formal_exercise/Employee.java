package simple_formal_exercise;

import java.time.LocalDate;

public class Employee {
    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    Employee(){
        System.out.println("Employee zero-arg constructor!");
        this.printName();
    }

    Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


    public void printName(){
        System.out.println("Employee name is printed: " + name);
    }
    public String getName(){return name;}
    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary = salary;}
    public LocalDate getHireDay(){return hireDay;}

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
