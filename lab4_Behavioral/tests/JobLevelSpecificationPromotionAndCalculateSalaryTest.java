package Lab3.tests;

import Lab3.JobLevelSpecifications.Bronze;
import Lab3.JobLevelSpecifications.Gold;
import Lab3.JobLevelSpecifications.JobLevelSpecification;
import Lab3.JobLevelSpecifications.Silver;
import Lab3.JobLevels.Begginer;
import Lab3.Models.Employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JobLevelSpecificationPromotionAndCalculateSalaryTest {
    public static void main(String [] args) throws Exception {
        Employee employee = new Employee(
                new Begginer(),
                new BigDecimal("1000"),
                new Date(),
                new Bronze()
        );

        List<JobLevelSpecification> jobLevelSpecifications = Arrays.asList(
                new Bronze(),
                new Silver(),
                new Gold()
        );

        for(JobLevelSpecification level: jobLevelSpecifications){
            System.out.println("Testing " + level.getClass().getSimpleName());
            System.out.println("level: " + employee.obtainJobLevelSpecificationName());
            System.out.println("salary: " + employee.getSalary() + "\n");
        }
    }
}
