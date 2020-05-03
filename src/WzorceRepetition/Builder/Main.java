package WzorceRepetition.Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .model("ford")
                .gears(5)
                .build();

        System.out.println(car.getModel());
        System.out.println(car.getSpeed());
        System.out.println(car.getGears());
        System.out.println(car.getCountry());
    }
}
