package simple_formal_projects_2;

import java.util.Scanner;

public class AreaComputer {
    public static void main(String[] args) {

        String inputChar;
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        Scanner scanner = new Scanner(System.in);
        inputChar = scanner.nextLine();

        switch(inputChar){
            case "R":
                double width, length;
                System.out.println("Enter the width of the Rectangle");
                width = scanner.nextDouble();
                System.out.println("Enter the length of the Rectangle");
                length = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(width, length);
                System.out.println("The area of Rectangle is: " + rectangle.computeArea());

                break;
            case "T":
                double base, height;
                System.out.println("Enter the base of the Triangle");
                base = scanner.nextDouble();
                System.out.println("Enter the height of the Triangle");
                height = scanner.nextDouble();

                Triangle triangle = new Triangle(base, height);
                System.out.println("The area of Triangle is: " + triangle.computeArea());
                break;
            case "C":
                double radius;
                System.out.println("Enter the radius of the Circle");
                radius = scanner.nextDouble();

                Circle circle = new Circle(radius);
                System.out.println("The area of Circle is: " + circle.computeArea());
                break;
            default:
                System.out.println("Please Enter either C, R or T again!");
        }

    }
}
