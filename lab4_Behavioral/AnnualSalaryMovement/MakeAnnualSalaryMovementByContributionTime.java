package Lab3.AnnualSalaryMovement;

import Lab3.Models.Employee;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementByContributionTime extends AnnualSalaryMovement{
    public MakeAnnualSalaryMovementByContributionTime(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public boolean conditionToMakeMovement(Employee employee) {
        return employee.getContributionTimeInYears() > 1;
    }

    @Override
    public BigDecimal obtainPercentageAppliedToMovement() {
        return new BigDecimal("0.2");
    }
}
