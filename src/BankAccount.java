public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(String accountNumber, double initialbalance) {
        this.accountNumber = accountNumber;
        this.balance = initialbalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0) {
            throw new InvalidAmountException("Invalid Funds");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InvalidFundsException{
        if(amount <= 0 || amount > balance){
            throw new InvalidFundsException("Invalid Amount");
        }

        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
