package WzorzecFrontController;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private Boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        // log each request
        trackRequest(request);

        // authenticate user
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }



}
