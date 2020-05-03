package IteratorAndMatrices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(8);
        intList.add(1);
        intList.add(6);

        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        int[] array = {12, 24, 10, 7, 2, 9, 4, 15};
        Arrays.sort(array);
        int i = Arrays.binarySearch(array, 24);
        System.out.println(i);

        System.out.println("====================================================");

        int[] arr = new int[10];
        Arrays.fill(arr, 1);
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("%d %n", arr[i]);
        }

        System.out.println("====================================================");

        int[][] twoDimArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String s = Arrays.deepToString(twoDimArr);
        System.out.println(s);

        System.out.println("====================================================");

        int[][] newArray = new int[3][3];
        for (int j = 0; j < newArray[0].length; j++) {
            newArray[0][j] = 1;
        }
        String str = Arrays.deepToString(newArray);
        System.out.println(str);

        System.out.println("====================================================");

        for (int k = 1; k < newArray.length; k++) {
            for (int l = 0; l < newArray[k].length; l++) {
                newArray[k][l] = 6;
            }
        }
        String str1 = Arrays.deepToString(newArray);
        System.out.println(str1);

        System.out.println("====================================================");


    }
}
