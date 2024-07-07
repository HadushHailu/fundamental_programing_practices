package simple_formal_project_8;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sum = 0;
		//implement
		for(EmployeeData employeeData: aList){
			sum += employeeData.getSalary();
		}
		//compute sum of all salaries of people in aList and return
		return sum;
	}
}
