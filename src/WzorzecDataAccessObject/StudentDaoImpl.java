package WzorzecDataAccessObject;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentDaoImpl implements StudentDao  {
    List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
        Student student1 = new Student("Guy");
        Student student2 = new Student("Ritchie");
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Student is not vailable;"));
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        System.out.println("Student with id: " + student.getId() + " has been updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println("Student: " + student.getName() + " has been deleted.");
    }
}
