package WzorceRepetition.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StacjaPogodowa implements StacjaPogodowaInterface {

    private List<CzytnikPogody> czytniki;
    private int temperatura;

    public StacjaPogodowa(int temperatura) {
        this.temperatura = temperatura;
        this.czytniki = new ArrayList<>();
    }

    @Override
    public void dodajCzytnik(CzytnikPogody czytnikPogody) {
        czytniki.add(czytnikPogody);
    }

    @Override
    public void usuńCzytnik(CzytnikPogody czytnikPogody) {
        czytniki.remove(czytnikPogody);
    }

    @Override
    public void powiadom() {
        Iterator<CzytnikPogody> iterator = czytniki.iterator();
        while(iterator.hasNext()){
            CzytnikPogody czytnik = iterator.next();
            czytnik.update(temperatura);
        }
    }

    public void setTemperatura(int newTemperatura){
        System.out.println("Nowa temperatura: " + newTemperatura);
        temperatura = newTemperatura;
        powiadom();
    }
}
