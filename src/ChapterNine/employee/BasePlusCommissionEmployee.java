package ChapterNine.employee;

public class BasePlusCommissionEmployee {

    public double getBaseSalary() {
        return baseSalary;
    }

    private double baseSalary;
    private CommissionEmployee commissionEmployee;

    public BasePlusCommissionEmployee(double baseSalary,CommissionEmployee commissionEmployee){
        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("base salary must be >= 0.0");
        }
            this.baseSalary = baseSalary;

        this.commissionEmployee = commissionEmployee;


    }

    public double getEarning(){
        return getBaseSalary() * commissionEmployee.earnings();
    }
}
