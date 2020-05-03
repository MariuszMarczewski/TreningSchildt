package enums;

public class Main {
    public static void main(String[] args) {
        Car c = Car.HONDA;
        Car[] values = Car.values();
        for(Car car: values){
            System.out.println(car);
        }

        System.out.println();
        c = Car.valueOf("HONDA");
        System.out.println(c);
        System.out.println();

        int ordinal = Car.HONDA.ordinal();
        int speed = Car.HONDA.getSpeed();
        int i = Car.HONDA.compareTo(Car.VOLVO);
        System.out.println(i);
    }
}
