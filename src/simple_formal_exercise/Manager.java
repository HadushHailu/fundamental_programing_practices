package simple_formal_exercise;

import java.time.LocalDate;

public class Manager extends Employee{
    private double bonus;



    Manager(){System.out.println("Manager zero-arg constructor!");}

    public Manager(String name,
                   double salary,
                   int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary(){
        //no direct access to private variables of //superclass
        double baseSalary = super.getSalary();
        return baseSalary + this.yearBonus();
    }

    public double yearBonus(){
        return 4*bonus;
    }
    public void setBonus(double b){bonus = b;}
    public double getBonus(){return bonus;}
}
