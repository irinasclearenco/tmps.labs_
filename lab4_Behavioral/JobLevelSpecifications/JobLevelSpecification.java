package Lab3.JobLevelSpecifications;

import Lab3.Models.Employee;

public abstract class JobLevelSpecification {

    public void updateToNextJobLevelSpecification(Employee employee) throws Exception {
        throw new Exception("Can't update to the next level");
    }
}