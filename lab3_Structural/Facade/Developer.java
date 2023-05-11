package Lab2.Facade;

public class Developer {
    public void doJobBeforeDEadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems... ");
        }else{
            System.out.println("Developer is reading a book... ");
        }
    }
}   