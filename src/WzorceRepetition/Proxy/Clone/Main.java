package WzorceRepetition.Proxy.Clone;

public class Main {
    public static void main(String[] args) {
        Movie movie = new ProxyMovie("Olymp has fallen");
        movie.display();
    }
}
