package ChapterThree;
import java.util.Scanner;
public class EmployeeDriver {


    public static void main(String[] args) {
        Employee employee1 = new Employee("Onwuka", "Lotachukwu",35000.00);
        Employee employee2 = new Employee("Adeola", "Onwuka", 56000.00);
        //to get detail about employee1
        System.out.printf("The first name is: %s%n",employee1.getFirstName());
        System.out.printf("The last name is: %s%n",employee1.getLastName());
        System.out.printf("The monthly salary is: %.2f%n",employee1.getMonthlySalary());
        System.out.printf("Therefore,The yearly salary is: %.2f%n%n%n%n",employee1.getYearlySalary());

        //employee2
        System.out.printf("The first name is: %s%n",employee2.getFirstName());
        System.out.printf("The first name is: %s%n",employee2.getLastName());
        System.out.printf("The first name is: %.2f%n",employee2.getMonthlySalary());
        System.out.printf("Therefore,The yearly salary is: %.2f%n%n%n%n",employee2.getYearlySalary());
       // System.out.print("Therefore yearly salary is:");
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter monthly salary:");
        double monthlySalary = scan.nextDouble();
        System.out.println();
        System.out.println();
        employee1.setFirstName(firstName);
        System.out.printf("The first name is %s%n", employee1.getFirstName());

        employee1.setLastName(lastName);
        System.out.printf("The last name is %s%n", employee1.getLastName());

        employee1.setMonthlySalary(monthlySalary);
        System.out.printf("The monthly salary is %.2f%n",employee1.getMonthlySalary());

        System.out.printf("Therefore,yearly salary is %.2f%n", employee1.getYearlySalary());

        System.out.printf("After  percent increase,yearly salary is %.2f", employee1.getYearlySalaryTenPercentIncrease());
    }
}
