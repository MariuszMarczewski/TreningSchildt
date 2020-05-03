package typySparametryzowane;

public class GenomNumber<T extends Number> {
    T obj;

    public GenomNumber(T obj) {
        this.obj = obj;
    }

    double reciprocal(){
        return 1 / obj.doubleValue();
    }

    double fraction(){
        return obj.doubleValue() - obj.intValue();
    }
}
