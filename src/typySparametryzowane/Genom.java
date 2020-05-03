package typySparametryzowane;

public class Genom<T> {
    private T obj;

    public Genom(T obj){
        this.obj = obj;
    }

    T getObj(){
        return obj;
    }

    void showType(){
        System.out.println(obj.getClass().getSimpleName());
    }

}

