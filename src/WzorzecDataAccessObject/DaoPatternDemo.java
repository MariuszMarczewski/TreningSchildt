package WzorzecDataAccessObject;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for(Student student : studentDao.getAllStudents()){
            System.out.println(student.getId() + " : " + student.getName());
        }

        System.out.println("=============================================");

        Student student = studentDao.getStudent(1);
        student.setName("Valencia");
        studentDao.updateStudent(student);

    }
}
