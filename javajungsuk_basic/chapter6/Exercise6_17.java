package javajungsuk_basic.chapter6;

import java.util.Arrays;

public class Exercise6_17 {
    static int[] shuffle(int[] arr) {
        if(arr == null) return arr;

        for(int i=0; i<arr.length; i++) {
            int j = (int) Math.random() * arr.length;

            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
