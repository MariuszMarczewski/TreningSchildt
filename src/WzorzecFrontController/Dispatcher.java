package WzorzecFrontController;

public class Dispatcher {
    private HomeView  homeView;
    private StudentView studentView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        } else {
            homeView.show();
        }

    }
}
