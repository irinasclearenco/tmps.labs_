package Lab3.Calculators;

import Lab3.JobLevels.JobLevel;

import java.math.BigDecimal;

public class SporadicSalaryMovementCalculator {

    public static BigDecimal calculate(BigDecimal salary, JobLevel jobLevel){
        return jobLevel.calculateSalaryMovement(salary);
    }
}