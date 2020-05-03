package reverseArrays;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 4, 3, 13, 9, 6};
        int[] reverse = Reverse.reverse(array);
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        int min = Minimum.getMin(array);
        System.out.println(min);
        System.out.println();

        int max = Maximum.getMax(array);
        System.out.println(max);

        Integer[] arr = {2, 3, 4, 5, 6};
        double v = Arrays.stream(arr).mapToInt(Integer::intValue).average().orElseThrow(IllegalArgumentException::new);
        System.out.println(v);

        System.out.println("=============================================");

        List<Integer> list = Arrays.asList(arr);
        ListIterator<Integer> iterator = list.listIterator();

        iterator.forEachRemaining(System.out::println);

        Integer[] convArray = new Integer[list.size()];

        Integer[] integers = list.toArray(convArray);

        System.out.println("=============================================");

        iterator.forEachRemaining(System.out::println);

        Collections.rotate(list, 1);

        System.out.println("=============================================");

        list.forEach(System.out::println);




    }
}
