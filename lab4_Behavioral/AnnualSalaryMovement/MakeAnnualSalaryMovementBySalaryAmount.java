package Lab3.AnnualSalaryMovement;

import Lab3.Models.Employee;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementBySalaryAmount extends AnnualSalaryMovement {
    public MakeAnnualSalaryMovementBySalaryAmount(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public boolean conditionToMakeMovement(Employee employee) {
        BigDecimal salary = employee.getSalary();
        return salary.compareTo(new BigDecimal("20000")) >= 0;
    }

    @Override
    public BigDecimal obtainPercentageAppliedToMovement() {
        return new BigDecimal("0.6");
    }
}