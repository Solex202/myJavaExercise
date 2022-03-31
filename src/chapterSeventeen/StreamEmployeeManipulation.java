package chapterSeventeen;

public class StreamEmployeeManipulation {

    public static void main(String[] args) {
//        Employee [] employees = {
//                new Employee("esther","jb", "it");
//        }
    }


    class Employee{
        private String firstName;
        private String lastName;
        private String department;
        private int salary;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Employee(String firstName, String lastName, String department, int salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.salary = salary;
        }
    }
}
