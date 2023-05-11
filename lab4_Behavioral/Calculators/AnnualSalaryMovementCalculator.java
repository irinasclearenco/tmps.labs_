package Lab3.Calculators;

import Lab3.AnnualSalaryMovement.AnnualSalaryMovement;
import Lab3.AnnualSalaryMovement.MakeAnnualSalaryMovementByContributionTime;
import Lab3.AnnualSalaryMovement.MakeAnnualSalaryMovementByJobLevel;
import Lab3.AnnualSalaryMovement.MakeAnnualSalaryMovementBySalaryAmount;
import Lab3.AnnualSalaryMovement.WithoutAnnualSalaryMovement;
import Lab3.Models.Employee;

import java.math.BigDecimal;

public class AnnualSalaryMovementCalculator {
    public static BigDecimal calculateFor(Employee employee){
        AnnualSalaryMovement annualSalaryMovement = new MakeAnnualSalaryMovementBySalaryAmount(
                new MakeAnnualSalaryMovementByJobLevel(
                        new MakeAnnualSalaryMovementByContributionTime(
                                new WithoutAnnualSalaryMovement()
                        )
                )
        );

        return annualSalaryMovement.calculateSalaryMovementFor(employee);
    }
}