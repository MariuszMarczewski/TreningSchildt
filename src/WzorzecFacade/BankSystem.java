package WzorzecFacade;

public class BankSystem {

    public int checkAccountAmount(int pin){
        if (pin == 1234){
            return 247;
        } else {
            throw new RuntimeException("illegal access");
        }
    }

    public String whithdrawAmount(int sum){
       return "Withdrew:  " + sum;
    }

    public String makeTransfer(int sum){
        return "Transferred: " + sum;
    }
}
