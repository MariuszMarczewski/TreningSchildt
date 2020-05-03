package typySparametryzowane;

public class GenomDouble<T, V> {
    private T obj;
    private V obj1;

    public GenomDouble(T obj, V obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public T getObj() {
        return obj;
    }

    public V getObj1() {
        return obj1;
    }

    void showTypes(){
        System.out.printf("%s %n%s", obj.getClass(), obj1.getClass());
    }
}
