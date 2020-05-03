package referenceAnotherAlternative;

public class MyNum {

    private int value;

    public MyNum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    boolean isFactor(int a){
        return value % a == 0;
    }
}
