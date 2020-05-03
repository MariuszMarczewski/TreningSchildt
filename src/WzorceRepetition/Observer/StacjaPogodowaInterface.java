package WzorceRepetition.Observer;

public interface StacjaPogodowaInterface {
    void dodajCzytnik(CzytnikPogody czytnikPogody);
    void usuńCzytnik(CzytnikPogody czytnikPogody);
    void powiadom();
}
