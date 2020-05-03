package WzorzecBuilder;

public class Main {

    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd.Builder()
                .name("Ford")
                .speed(123)
                .doors(5)
                .build();

        System.out.println(pojazd.getName());
        System.out.println(pojazd.getDoors());
        System.out.println(pojazd.getSpeed());
        System.out.println(pojazd.getCountry());
    }

}
