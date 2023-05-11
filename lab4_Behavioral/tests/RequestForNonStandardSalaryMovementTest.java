package Lab3.tests;

import Lab3.NonStandardSalaryMovement.RequestForNonStandardSalaryMovement;
import Lab3.NonStandardSalaryMovement.RequestForNonStandardSalaryMovementHandler;
import Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement.SaveRequest;
import Lab3.NonStandardSalaryMovement.RequestsForNonStandardSalaryMovement.SendEmailSalaryMovementService;

import java.util.Arrays;

public class RequestForNonStandardSalaryMovementTest {
    public static void main(String[] args){
        RequestForNonStandardSalaryMovement requestForNonStandardSalaryMovement = new RequestForNonStandardSalaryMovement(
                "Vasile",
                GenerateData.obtainTestEmployee(),
                true,
                "Tester"
        );
        RequestForNonStandardSalaryMovementHandler handler = new RequestForNonStandardSalaryMovementHandler(
                Arrays.asList(
                        new SaveRequest(),
                        new SendEmailSalaryMovementService()
                )
        );
        handler.execute(requestForNonStandardSalaryMovement);
    }
}