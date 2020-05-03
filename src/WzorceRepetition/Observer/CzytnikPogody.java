package WzorceRepetition.Observer;

public class CzytnikPogody {
    private static int nextId;
    private int id;

    {
        id = nextId;
        nextId++;
    }

    public CzytnikPogody() {
        this.id = nextId;
    }

    public int getId() {
        return id;
    }

    public void update(int temperatura){
        System.out.println("Odczyt temperatury w czytniku: " + temperatura);
    }


}
