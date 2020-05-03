package WzorceRepetition.MVC;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getName(){
        return model.getName();
    }

    public int getScholarship(){
        return model.getScholarship();
    }

    public void updateView(){
        view.printStudentInfo(model.getName(), model.getScholarship());
    }
}
