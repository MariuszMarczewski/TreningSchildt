package wzorzecFabryka;

import java.util.Arrays;

public class MaxValue implements MinMaxValueInterface {
    @Override
    public Integer getResult(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).max()
                .orElseThrow(() ->
                        new ValueNotFoundException("Required value not available"));
    }
}
