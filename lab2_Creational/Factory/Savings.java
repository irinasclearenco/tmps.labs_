package Lab1.Factory;

public class Savings implements BankAccount{
    
    @Override
    public String balance() {
        return "Savings Account Balance: 500$";
    }
    
}
