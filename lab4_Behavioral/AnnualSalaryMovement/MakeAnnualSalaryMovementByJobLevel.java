package Lab3.AnnualSalaryMovement;

import Lab3.Models.Employee;
import Lab3.JobLevels.Advanced;
import Lab3.JobLevels.Intermediary;
import Lab3.JobLevels.JobLevel;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementByJobLevel extends AnnualSalaryMovement {

    public MakeAnnualSalaryMovementByJobLevel(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public boolean conditionToMakeMovement(Employee employee) {
        JobLevel jobLevel = employee.getJobLevel();
        return jobLevel instanceof Advanced || jobLevel instanceof Intermediary;
    }

    @Override
    public BigDecimal obtainPercentageAppliedToMovement() {
        return new BigDecimal("0.4");
    }
}
