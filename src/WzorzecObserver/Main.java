package WzorzecObserver;

public class Main {

    public static void main(String[] args) {

        CzytnikPogody cp1 = new CzytnikPogody(1);
        StacjaPogodowa stacja = new StacjaPogodowa(22);

        stacja.dodajCzytnik(cp1);
        stacja.powiadom();
        System.out.println("=============================");

        CzytnikPogody cp2 = new CzytnikPogody(2);
        CzytnikPogody cp3 = new CzytnikPogody(3);

        stacja.dodajCzytnik(cp2);
        stacja.dodajCzytnik(cp3);

        stacja.setTemperatura(28);

    }

}

