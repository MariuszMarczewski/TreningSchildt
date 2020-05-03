package referencesAlternativ;

import java.util.function.Predicate;

public class TestClassMain {

    static boolean numTest(TestInterface t, int a){
        return t.test(a);
    }

    public static void main(String[] args) {
        boolean b = numTest(TestClass::isPrime, 13);
        System.out.println(b);

    }

}
