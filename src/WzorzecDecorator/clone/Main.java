package WzorzecDecorator.clone;

public class Main {
    public static void main(String[] args) {
        Dog badDog = new BadDog();
        badDog.bark();

        System.out.println("==============================================");

        Dog leashBadDog = new LeashDogDecorator(badDog);
        leashBadDog.bark();
    }
}
