package WzorzecFrontController;

public class FrontControllerDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("student");
        frontController.dispatchRequest("home");
    }
}
