package Lab3.NonStandardSalaryMovement;

import Lab3.Models.Employee;

public class RequestForNonStandardSalaryMovement {
    private String managerName;
    private Employee employee;
    private String description;

    public RequestForNonStandardSalaryMovement(String managerName, Employee employee, boolean isAskedByHimself, String description) {
        this.managerName = managerName;
        this.employee = employee;
        this.description = description;
    }

    public String getManagerName() {
        return managerName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDescription() {
        return description;
    }
}