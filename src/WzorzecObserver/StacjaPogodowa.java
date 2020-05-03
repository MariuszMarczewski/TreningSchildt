package WzorzecObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StacjaPogodowa implements StacjaPogodowaInterface {
    List<CzytnikPogody> czytniki;
    int temperatura;

    public StacjaPogodowa(int temperatura) {
        czytniki = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void dodajCzytnik(CzytnikPogody czytnik) {
        czytniki.add(czytnik);
    }

    @Override
    public void usuńCzytnik(CzytnikPogody czytnik) {
        czytniki.remove(czytnik);
    }

    @Override
    public void powiadom() {
        Iterator<CzytnikPogody> iterator = czytniki.iterator();
        while(iterator.hasNext()){
            CzytnikPogody cp = iterator.next();
            cp.update(temperatura);
        }
    }

    public void setTemperatura(int newTemperatura){
        System.out.println("Nowa temperatura: " + newTemperatura);
        temperatura = newTemperatura;
        powiadom();
    }
}
