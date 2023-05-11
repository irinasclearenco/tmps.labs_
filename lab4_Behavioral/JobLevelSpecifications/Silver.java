package Lab3.JobLevelSpecifications;

import Lab3.Models.Employee;

import java.math.BigDecimal;

public class Silver extends JobLevelSpecification {

    @Override
    public void updateToNextJobLevelSpecification(Employee employee) {
        employee.setJobLevelSpecification(new Gold());
        employee.setSalary(employee.getSalary().add(employee.getSalary().multiply(new BigDecimal("0.4"))));
    }
}