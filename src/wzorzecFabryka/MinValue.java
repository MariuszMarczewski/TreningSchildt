package wzorzecFabryka;

import java.util.Arrays;

public class MinValue implements MinMaxValueInterface {
    @Override
    public Integer getResult(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).min()
                .orElseThrow(() -> new ValueNotFoundException("Required value not available!"));
    }
}
