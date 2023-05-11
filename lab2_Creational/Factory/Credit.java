package Lab1.Factory;

public class Credit implements BankAccount {
    
    @Override
    public String balance() {
        return "Credit Account balance: 50$";
    }
}
