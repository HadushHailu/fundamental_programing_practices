package simple_formal_projects_2;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private static int restingHeartRate = 70;
    private static double lowerBoundary = 0.5;
    private static double upperBoundary = 0.85;
    HeartRates(String firstName, String lastName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public int getMaximumHeartRate(int age){
        return 220 - age;
    }

    public int getAverageHeartRate(int mhr){
        return mhr - restingHeartRate;
    }

    public double getLowerBoundaryTargetHeartRate(int ahr){
        return (ahr * lowerBoundary) + restingHeartRate;
    }

    public double getUpperBoundaryTargetHeartRate(int ahr){
        return (ahr * upperBoundary) + restingHeartRate;
    }
    public int getAge(){
        AgeCalculator ageCalculator = new AgeCalculator();
        return ageCalculator.calculateAge(dateOfBirth).getYears();
    }

    public void printTargetHeartRange(double lbthr, double ubthr){
        System.out.println("The target Heart Rate Range is between: " + lbthr + " and " + ubthr);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("age: " + getAge());
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Maximum Heart Rate: " + getMaximumHeartRate(getAge()));


    }
    public static void main(String[] args) {

        String firstName, lastName;
        LocalDate dateOfBirth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first name: " );
        firstName = scanner.nextLine();

        System.out.println("Please, enter your last name: " );
        lastName = scanner.nextLine();

        System.out.println("Please, enter your birth date in the format - (yyyy-mm-dd) - Example 1989-4-14: " );
        dateOfBirth = LocalDate.parse(scanner.nextLine());

        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        int age = heartRates.getAge();
        int maximumHR = heartRates.getMaximumHeartRate(age);
        int averageHR = heartRates.getAverageHeartRate(maximumHR);
        double lbthr = heartRates.getLowerBoundaryTargetHeartRate(averageHR);
        double ubthr = heartRates.getUpperBoundaryTargetHeartRate(averageHR);
        heartRates.printTargetHeartRange(lbthr, ubthr);



    }
}
