package Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement;

import Lab3.Models.RequestForSalaryMovement;

public interface RequestForNonStandardSalaryMovementAction {
    void executeAction(RequestForSalaryMovement request);
}