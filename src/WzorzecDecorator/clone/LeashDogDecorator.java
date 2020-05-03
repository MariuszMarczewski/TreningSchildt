package WzorzecDecorator.clone;

public class LeashDogDecorator extends DogDecorator{
    public LeashDogDecorator(Dog dog) {
        super(dog);
    }

    @Override
    public void bark() {
        super.bark();
        leashDog(dog);
    }

    private void leashDog(Dog dog) {
        System.out.println(("Dog was put on a leash!"));
    }
}
