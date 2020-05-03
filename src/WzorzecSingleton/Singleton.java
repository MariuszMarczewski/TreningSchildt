package WzorzecSingleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("wzorzec Singleton");
    }
}
