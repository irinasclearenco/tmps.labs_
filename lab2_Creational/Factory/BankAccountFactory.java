package Lab1.Factory;

public class BankAccountFactory {
    static BankAccount getInstance(String accountName) {
        if (accountName.equalsIgnoreCase("Savings")) {
            return new Savings();
        } else if (accountName.equalsIgnoreCase("Cheque")) {
            return new Cheque();
        } else {
            return new Credit();
        }
    }
}
