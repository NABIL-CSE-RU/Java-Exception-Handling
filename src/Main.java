public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("5310857613",100.0);
         try {
             bankAccount.deposit(50.0);
             bankAccount.withdraw(200.0);
             bankAccount.withdraw(50.0);
             bankAccount.deposit(-10.0);
         }
         catch (InvalidFundsException | InvalidAmountException e){
             System.out.println(e.getMessage());
         }

         finally {
             System.out.println("New Balance: " + bankAccount.getBalance());

         }

    }
}
