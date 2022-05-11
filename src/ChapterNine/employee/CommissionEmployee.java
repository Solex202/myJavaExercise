package ChapterNine.employee;

public class CommissionEmployee extends Object{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales


    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
 String socialSecurityNumber, double grossSales,
 double commissionRate)
 {
         // implicit call to Object's default constructor occurs here
         // if grossSales is invalid throw exception
         if (grossSales < 0.0)
             throw new IllegalArgumentException(
                 "Gross sales must be >= 0.0");

         // if commissionRate is invalid throw exception
         if (commissionRate <= 0.0 || commissionRate >= 1.0)
             throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0");
         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.grossSales = grossSales;
         this.commissionRate = commissionRate;
         } //

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
         return getCommissionRate() * getGrossSales();
         }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
