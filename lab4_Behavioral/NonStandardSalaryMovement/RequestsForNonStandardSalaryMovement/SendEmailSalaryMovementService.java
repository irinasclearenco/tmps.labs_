package Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement;

import Lab3.Models.RequestForSalaryMovement;

public class SendEmailSalaryMovementService implements RequestForNonStandardSalaryMovementAction {
    @Override
    public void executeAction(RequestForSalaryMovement request) {
        System.out.println("Sending e-mails for object: " + request);
    }
}
