package inheritance.newVersionWithComparable;

import java.util.Objects;

public class Student {
    private String name;
    private int scholarship;
    private static int nextId;
    private int id;

    {
        id = nextId;
        nextId++;
    }

    public Student(String name, int scholarship) {
        this.name = name;
        this.scholarship = scholarship;
        this.id = nextId;
    }

    public String getName() {
        return name;
    }

    public int getScholarship() {
        return scholarship;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return scholarship == student.scholarship &&
                id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scholarship, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scholarship=" + scholarship +
                ", id=" + id +
                '}';
    }
}
