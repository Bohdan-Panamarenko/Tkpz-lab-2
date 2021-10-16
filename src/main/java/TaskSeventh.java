import java.util.Arrays;

public class TaskSeventh {
    public static void main(String[] args) {
        int[] arr = GetArray.getArray();

        System.out.println(Arrays.toString(arr));

        System.out.printf("Minimal difference: %d", minDifference(arr));
    }

    public static int minDifference(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int len = arr.length - 1;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int diff = Math.abs(arr[j] - arr[i]);
                if (diff < min) {
                    min = diff;
                }
            }
        }

        return min;
    }
}
