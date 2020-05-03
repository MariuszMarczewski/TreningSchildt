package WzorceRepetition.Proxy.Clone;

public class RealMovie implements Movie {

    private String fileName;

    public RealMovie(String fileName) {
        this.fileName = fileName;
        loadMovie(fileName);
    }

    private void loadMovie(String fileName) {
        System.out.println("Loading movie:" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying movie: " + fileName);
    }
}
