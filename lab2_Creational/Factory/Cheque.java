package Lab1.Factory;

public class Cheque implements BankAccount {
    
    @Override
    public String balance() {
        return "Cheque Account balance: 1000$";
    }
}
