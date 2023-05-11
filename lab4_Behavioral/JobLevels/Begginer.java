package Lab3.JobLevels;

import java.math.BigDecimal;

public class Begginer implements JobLevel {
    @Override
    public BigDecimal calculateSalaryMovement(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.2"));
    }
}