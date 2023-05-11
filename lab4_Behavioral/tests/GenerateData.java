package Lab3.tests;

import Lab3.JobLevelSpecifications.Gold;
import Lab3.JobLevels.Advanced;
import Lab3.Models.Employee;

import java.math.BigDecimal;
import java.util.Date;

public class GenerateData {
    public static Employee obtainTestEmployee(){
        return new Employee(
                new Advanced(),
                new BigDecimal("10000"),
                new Date(),
                new Gold()
        );
    }
}
