package Lab3.NonStandardSalaryMovement;

import Lab3.Models.RequestForSalaryMovement;
import Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement.RequestForNonStandardSalaryMovementAction;

import java.util.Date;
import java.util.List;

public class RequestForNonStandardSalaryMovementHandler {

    private List<RequestForNonStandardSalaryMovementAction> actions;

    public RequestForNonStandardSalaryMovementHandler(List<RequestForNonStandardSalaryMovementAction> actions) {
        this.actions = actions;
    }

    public void execute(RequestForNonStandardSalaryMovement requestForNonStandardSalaryMovement){
        RequestForSalaryMovement requestForSalaryMovement = new RequestForSalaryMovement(
                requestForNonStandardSalaryMovement.getDescription(),
                new Date(),
                requestForNonStandardSalaryMovement.getManagerName(),
                requestForNonStandardSalaryMovement.getEmployee()
        );

        for(RequestForNonStandardSalaryMovementAction action: actions){
            action.executeAction(requestForSalaryMovement);
        }
    }

}