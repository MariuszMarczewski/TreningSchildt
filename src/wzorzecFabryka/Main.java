package wzorzecFabryka;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Integer[] array = {3, 4, 5, 6};
        MinMaxValueInterface produce = factory.produce(ValueType.MIN);
        Integer result = produce.getResult(array);
        System.out.println(result);

    }
}
