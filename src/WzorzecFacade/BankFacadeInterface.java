package WzorzecFacade;

public interface BankFacadeInterface {
    public boolean verify(int pin);
    public int checkAccountAmount(int pin);
    public String withdrawAmount(int sum);
}
