package referencesAlternativ;

import java.util.function.Predicate;

public class MyIntNum {

    private int value;

    public MyIntNum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    boolean isFactor(int a){
        return (value % a == 0);
    }
}
