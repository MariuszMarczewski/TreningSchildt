package WzorzecFacade;

public class BankLogin {

    public boolean authorize(int pin){
        if(pin == 1234){
            return true;
        } else {
            return false;
        }
    }

    public boolean creditCardVerify(String cardNo){
        if(cardNo.equals("123456789")){
            return true;
        } else {
            return false;
        }
    }

    public boolean webIdentify(){
        return true;
    }

}
