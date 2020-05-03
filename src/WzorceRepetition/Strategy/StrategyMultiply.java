package WzorceRepetition.Strategy;

public class StrategyMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
