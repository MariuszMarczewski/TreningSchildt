package WzorzecObserver;

public class CzytnikPogody {
    int kolejnyNumer;

    public CzytnikPogody(int kolejnyNumer) {
        this.kolejnyNumer = kolejnyNumer;
    }

    public void update(int temperatura){
        System.out.println("Odczyt w czytniku nr " + kolejnyNumer + " : " + temperatura + " stopni" );
    }
}
