package semicolon.africa.tddpractise;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {


    @Test
    public void testThatEmployeeExist(){
        //given
        EmployeeClass employee = new EmployeeClass("lota", "chukwu",90.00);
        EmployeeClass employee2 = new EmployeeClass("deola", "oladeji", 45.23);
        //when
        String result = employee.getFirstName();
        String result2 = employee2.getLastName();
        //assert
        assertEquals(result, "lota");
        assertEquals(result2, "oladeji");
    }

    @Test
    public void testThatEmployeeFieldsCanBeChanged(){
        //given
        EmployeeClass employee = new EmployeeClass("lota", "chukwu",90.00);
        EmployeeClass employee2 = new EmployeeClass("deola", "oladeji", 45.23);
        //when
         employee.setFirstName("kill");
         //assert
        assertEquals(employee.getFirstName(), "kill");
    }

    @Test
    public void testThatEmployeeYearlySalaryCanBeCalculated(){
        //given
        EmployeeClass employee = new EmployeeClass("lota", "chukwu",90.00);
        EmployeeClass employee2 = new EmployeeClass("deola", "oladeji", 45.23);
        //when
        double yearlySalary = employee.getMonthlySalary() * 12;
//        Rectangle rect = new Rectangle();
        assertEquals(yearlySalary,1080.00 );
    }

    @Test
    public void testThatEmployeeSalaryCanBeCalculatedAfter10PercentRaise(){
        //given
        EmployeeClass employee = new EmployeeClass("lota", "chukwu",90.00);
        EmployeeClass employee2 = new EmployeeClass("deola", "oladeji", 45.23);
        //when
        double yearlySalary = (employee.getMonthlySalary() * 0.10 * 12) + (employee.getMonthlySalary() * 12);
        //assert
        assertEquals(yearlySalary,1188);

    }

    @Test
    public void testThatMonthlySalaryShouldNotBeNegative(){
        //given
        EmployeeClass employee = new EmployeeClass("lota", "chukwu",90.00);
        EmployeeClass employee2 = new EmployeeClass("deola", "oladeji", 45.23);

        assertThrows(IllegalArgumentException.class ,()->employee.setMonthlySalary(-67.00));


    }
}
