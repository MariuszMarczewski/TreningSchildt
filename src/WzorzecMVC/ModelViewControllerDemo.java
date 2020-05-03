package WzorzecMVC;

public class ModelViewControllerDemo {
    public static void main(String[] args) {
        Student model = rerieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
    }

    private static Student rerieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Franek");
        student.setScholarship(1000);
        return student;
    }
}
