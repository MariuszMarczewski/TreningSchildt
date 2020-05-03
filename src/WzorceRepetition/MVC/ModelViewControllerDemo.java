package WzorceRepetition.MVC;

public class ModelViewControllerDemo {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();

    }

    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Gus");
        student.setScholarship(1200);
        return student;
    }
}
