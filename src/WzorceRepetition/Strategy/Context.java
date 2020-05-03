package WzorceRepetition.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int realizeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
