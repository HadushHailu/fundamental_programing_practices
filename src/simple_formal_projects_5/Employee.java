package simple_formal_projects_5;

import java.util.Arrays;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    Employee(){}
    Employee(String firstName,
             String lastName,
             String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public abstract double getPayment();

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
