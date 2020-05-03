package WzorzecDecorator.secondClone;

public class Main {
    public static void main(String[] args) {
        Book crimeBook = new CrimeBook();
        crimeBook.smell();

        System.out.println("===============================================");

        Book framedCrimeBook = new FrameBookDecorator(new CrimeBook());
        framedCrimeBook.smell();
    }
}
