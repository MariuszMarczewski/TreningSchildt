package reverseArrays;

public class Minimum {
    static int getMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                array[i] = min;
            }
        }
        return min;
    }
}
