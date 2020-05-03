package WzorzecDecorator.clone;

public abstract class DogDecorator implements Dog {
    protected Dog dog;

    public DogDecorator(Dog dog) {
        this.dog = dog;
    }

    public void bark() {
        dog.bark();

    }
}
