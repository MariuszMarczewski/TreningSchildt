package WzorceRepetition.Proxy.Clone;

public class ProxyMovie implements Movie {

    private RealMovie realMovie;
    private String fileName;

    public ProxyMovie(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realMovie == null) {
            realMovie = new RealMovie(fileName);
        }
        realMovie.display();
    }
}
