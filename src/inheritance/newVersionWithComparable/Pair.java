package inheritance.newVersionWithComparable;

import java.util.List;
import java.util.Objects;

public class Pair<T>{

    private T firstObject;
    private T secondObject;

    public Pair(T firstObject, T secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public void setFirstObject(T firstObject) {
        this.firstObject = firstObject;
    }

    public T getSecondObject() {
        return secondObject;
    }

    public void setSecondObject(T secondObject) {
        this.secondObject = secondObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?> pair = (Pair<?>) o;
        return Objects.equals(firstObject, pair.firstObject) &&
                Objects.equals(secondObject, pair.secondObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstObject, secondObject);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstObject=" + firstObject +
                ", secondObject=" + secondObject +
                '}';
    }
}
