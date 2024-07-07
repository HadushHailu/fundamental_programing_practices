package simple_formal_reflection_nested;

import java.util.Objects;

public class Company {
    private final String name;
    private int numOfEmployee;

    Company(String name,
            int numOfEmployee){
        this.name = name;
        this.numOfEmployee = numOfEmployee;
    }

    public String getName(){
        return name;
    }

    public int getNumOfEmployee(){
        return numOfEmployee;
    }

    private void setNumOfEmployee(int newNumber){
        this.numOfEmployee = newNumber;
    }

    private static void internalRule(){
        System.out.println("This is internal rules.");
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numOfEmployee=" + numOfEmployee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Overridden equals is called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return numOfEmployee == company.numOfEmployee && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfEmployee);
    }
}
