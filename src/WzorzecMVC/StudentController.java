package WzorzecMVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public int getStudentScholarship(){
        return model.getScholarship();
    }

    public void setStudentScholarship(int scholarship){
        model.setScholarship(scholarship);
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getScholarship());
    }


}
