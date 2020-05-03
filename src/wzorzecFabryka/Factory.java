package wzorzecFabryka;

public class Factory {
    public MinMaxValueInterface produce(ValueType valueType) {
        if (ValueType.MIN.equals(valueType)) {
            return new MinValue();
        } else if (ValueType.MAX.equals(valueType)) {
            return new MaxValue();
        }
        return null;
    }
}
