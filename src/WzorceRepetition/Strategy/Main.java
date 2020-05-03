package WzorceRepetition.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        int i = context.realizeStrategy(2, 3);
        System.out.println(i);
    }
}
