package WzorceRepetition.Observer;

public class Main {
    public static void main(String[] args) {
        StacjaPogodowa sp = new StacjaPogodowa(22);

        CzytnikPogody cp1 = new CzytnikPogody();
        CzytnikPogody cp2 = new CzytnikPogody();
        CzytnikPogody cp3 = new CzytnikPogody();

        sp.dodajCzytnik(cp1);
        sp.dodajCzytnik(cp2);
        sp.dodajCzytnik(cp3);

        sp.powiadom();

        System.out.println("=============================================================");

        sp.setTemperatura(28);
    }
}
