package Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement;

import Lab3.Models.RequestForSalaryMovement;

public class SaveRequest implements RequestForNonStandardSalaryMovementAction{
    @Override
    public void executeAction(RequestForSalaryMovement request) {
        System.out.println("Saving requests for object: " + request);
    }
}