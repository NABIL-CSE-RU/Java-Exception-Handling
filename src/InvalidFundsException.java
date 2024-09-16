public class InvalidFundsException extends Exception{
    public InvalidFundsException(String message){
        super(message);
    }
}
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}