package Lab3.tests;

import Lab3.Calculators.SporadicSalaryMovementCalculator;
import Lab3.Models.Employee;
import Lab3.JobLevels.Advanced;
import Lab3.JobLevels.Begginer;
import Lab3.JobLevels.Intermediary;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SporadicSalaryMovimentTest {
    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee(new Begginer(), new BigDecimal("1000"), new Date()),
                new Employee(new Intermediary(), new BigDecimal("1000"), new Date()),
                new Employee(new Advanced(), new BigDecimal("1000"), new Date())
        );

        for(Employee emp: employees){
            System.out.println(SporadicSalaryMovementCalculator.calculate(emp.getSalary(), emp.getJobLevel()));
        }
    }
}