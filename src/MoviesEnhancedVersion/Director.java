package MoviesEnhancedVersion;

public class Director {
    private String name;
    private long id;

    public Director(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +  ", id=" + id;
    }
}
