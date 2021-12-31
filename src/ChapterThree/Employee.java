package ChapterThree;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;


    public Employee(String firstName, String lastName, double monthlySalary){

        this.firstName = firstName;
        this.lastName = lastName;
       // this.monthlySalary = monthlySalary;

    if(monthlySalary > 0){
        this.monthlySalary = monthlySalary;
    }
    }


        public void setFirstName(String firstName){
                this.firstName = firstName;
        }

        public String getFirstName(){
        return firstName;
        }
       public void setLastName(String lastName){
        this.lastName = lastName;

       }
        public String getLastName(){
        return lastName;
        }

        public void setMonthlySalary(double monthlySalary){
            this.monthlySalary = monthlySalary;
        }
        public double getMonthlySalary(){


        return monthlySalary;
        }
        public double getYearlySalary(){
        //for 10% increase
           // yearlySalary = yearlySalary * 1.10;
            return monthlySalary * 12;
        }

        public double getYearlySalaryTenPercentIncrease(){
        return (monthlySalary * 12) * 1.10;
        }
}
