package references;

import java.util.function.Function;

public class TestMain {

    static boolean numTest(TestInterface t, int a) {
        return t.test(a);
    }
    public static void main(String[] args) {

        boolean result;
        result = numTest(TestClass::isPrime, 17);
        System.out.println(result);
    }
}
