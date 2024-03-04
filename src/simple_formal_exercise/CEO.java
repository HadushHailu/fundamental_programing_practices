package simple_formal_exercise;

public class CEO extends Manager{
    private String degreeLevel;
    private Employee employee;

    CEO(){
       this.employee = new Employee();
    }

    public Employee getEmployee() {
        return employee;
    }
}
