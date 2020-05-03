package interfaceTest;

import java.math.BigInteger;

public class DemoOneBroker implements DemoOne {
    @Override
    public boolean check(int a) {
        BigInteger bigInteger = BigInteger.valueOf(a);
        boolean probablePrime = bigInteger.isProbablePrime(100);
        return probablePrime;
    }
}
