import java.util.Arrays;

public class TaskTwelvth {
    public static void main(String[] args) {
        int[] arr = GetArray.getArray();

        System.out.println(Arrays.toString(arr));

        System.out.println(sequenceType(arr));
    }

    public static String sequenceType(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return "Array too short";
        }
        boolean isAsc = true;
        boolean isDesc = true;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (prev > arr[i]) {
                isAsc = false;
            } else if (prev < arr[i]) {
                isDesc = false;
            } else {
                isAsc = false;
                isDesc = false;
                break;
            }
        }

        if (isAsc) {
            return "Ascending order";
        } else if (isDesc) {
            return "Descending order";
        }
        return "Disordered";
    }
}
