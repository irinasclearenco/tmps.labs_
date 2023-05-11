package Lab3.Models;

import java.util.Date;

public class RequestForSalaryMovement {
    private String description;
    private Date inclusionDate;
    private String managerName;
    private Employee salaryMovementRecipient;

    public RequestForSalaryMovement(String description, Date inclusionDate, String managerName, Employee salaryMovementRecipient) {
        this.description = description;
        this.inclusionDate = inclusionDate;
        this.managerName = managerName;
        this.salaryMovementRecipient = salaryMovementRecipient;
    }

    @Override
    public String toString() {
        return "RequestForSalaryMovement{" +
                "description='" + description + '\'' +
                ", inclusionDate=" + inclusionDate +
                ", managerName='" + managerName + '\'' +
                ", salaryMovementRecipient=" + salaryMovementRecipient +
                '}';
    }
}