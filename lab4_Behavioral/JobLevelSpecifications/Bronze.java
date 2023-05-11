package Lab3.JobLevelSpecifications;

import Lab3.Models.Employee;

import java.math.BigDecimal;

public class Bronze extends JobLevelSpecification{

    @Override
    public void updateToNextJobLevelSpecification(Employee employee) {
        employee.setJobLevelSpecification(new Silver());
        employee.setSalary(employee.getSalary().add(employee.getSalary().multiply(new BigDecimal("0.2"))));
    }
}