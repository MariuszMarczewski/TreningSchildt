package reverseArrays;

public class Reverse {

    static int[] reverse(int[] array){
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1  - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    };

}
