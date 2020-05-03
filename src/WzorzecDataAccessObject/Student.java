package WzorzecDataAccessObject;

public class Student {
    private String name;
    private static int nextId;
    private int id;

    {
        id = nextId;
        nextId++;
    }

    public Student(String name) {
        this.name = name;
        this.id = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
