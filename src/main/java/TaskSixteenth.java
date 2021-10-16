import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskSixteenth {
    public static void main(String[] args) {
        System.out.println("--> Array A:");
        int[] arrA = GetArray.getArray();

        System.out.println("--> Array B:");
        int[] arrB = GetArray.getArray();

        System.out.println("--> Array A:");
        System.out.println(Arrays.toString(arrA));

        System.out.println("--> Array B:");
        System.out.println(Arrays.toString(arrB));

        try {
            System.out.println("--> Array A discard array B:");
            System.out.println(Arrays.toString(setSubst(arrA, arrB)));
        } catch (IllegalArgumentException err) {
            System.out.println(err);
        }
    }

    public static int[] setSubst(int[] a, int[] b) {
        if (arrayIsNotSet(a)) {
            throw new IllegalArgumentException("Array A should not contain equal numbers to be a set");
        } else if (arrayIsNotSet(b)) {
            throw new IllegalArgumentException("Array B should not contain equal numbers to be a set");
        }

        List<Integer>  diff = new ArrayList<>();

        for (int elemA : a) {
            if (!isInArray(b, elemA)) {
                diff.add(elemA);
            }
        }

        return listToArray(diff);
    }

    private static boolean arrayIsNotSet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    private static int[] listToArray(List<Integer> list) {
        int listSize = list.size();
        int[] arr = new int[listSize];

        for (int i = 0; i < listSize; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    private static boolean isInArray(int[] array, int num) {
        for (int elem : array) {

            if (elem == num) {
                return true;
            }
        }

        return false;
    }
}
