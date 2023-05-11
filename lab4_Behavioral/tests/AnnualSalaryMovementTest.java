package Lab3.tests;

import Lab3.Calculators.AnnualSalaryMovementCalculator;
import Lab3.Models.Employee;
import Lab3.JobLevels.Advanced;
import Lab3.JobLevels.Begginer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AnnualSalaryMovementTest {
    public static void main(String [] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 22);

        Employee receive20kOrMore = new Employee(new Advanced(), new BigDecimal("20000"), new Date());
        Employee advancedThatDontReceive20KOrMore = new Employee(new Advanced(), new BigDecimal("10000"), new Date());
        Employee begginerThatDontRcv20kOrMoreButHasMoreThan1YearOfCont = new Employee(new Begginer(), new BigDecimal("10000"), calendar.getTime());
        Employee doesntReceiveAnnualSalaryMovement = new Employee(new Begginer(), new BigDecimal("10000"), new Date());

        List<Employee> employees = Arrays.asList(
                receive20kOrMore,
                advancedThatDontReceive20KOrMore,
                begginerThatDontRcv20kOrMoreButHasMoreThan1YearOfCont,
                doesntReceiveAnnualSalaryMovement
        );

        for(Employee emp: employees){
            System.out.println(AnnualSalaryMovementCalculator.calculateFor(emp));
        }
    }
}