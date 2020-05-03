package WzorzecFacade;

public class BankFacade implements BankFacadeInterface {

    private BankSystem bankSystem;
    private BankLogin bankLogin;

    public BankFacade() {
        bankSystem = new BankSystem();
        bankLogin = new BankLogin();
    }

    @Override
    public boolean verify(int pin) {
        boolean verify = false;
        verify = bankLogin.authorize(pin);
        return verify;
    }

    @Override
    public int checkAccountAmount(int pin) {
        int amount = 0;
        amount = bankSystem.checkAccountAmount(pin);
        return amount;
    }

    @Override
    public String withdrawAmount(int sum) {
        return bankSystem.whithdrawAmount(sum);
    }
}
