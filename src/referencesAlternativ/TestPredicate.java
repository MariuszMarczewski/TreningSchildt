package referencesAlternativ;

import java.util.function.Predicate;

public class TestPredicate {

    Predicate<Integer> predicate = (a) -> {
        if(a < 2) {
            return true;
        }
        for (int i = 2; i < a / i; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    };

    public boolean isPrime(int a){
        return predicate.test(a);
    }

}
