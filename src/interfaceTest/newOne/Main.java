package interfaceTest.newOne;

public class Main {
    public static void main(String[] args) {
        Numeric num = (a, b) -> a * b;
        int i = num.doOperation(2, 3);
        System.out.println(i);
    }
}
