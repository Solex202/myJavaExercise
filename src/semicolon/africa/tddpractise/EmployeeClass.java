package semicolon.africa.tddpractise;

public class EmployeeClass {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public EmployeeClass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;


    }

    private void salaryValidator(double monthlySalary) {
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
        else{
            throw new IllegalArgumentException("monthly salary should be a positive number");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        salaryValidator(monthlySalary);
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }
}
