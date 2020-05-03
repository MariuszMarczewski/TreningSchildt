package reverseArrays;

public class Maximum {
    static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                array[i] = max;
            }
        }
        return max;
    }
}
