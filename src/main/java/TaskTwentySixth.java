import java.util.Arrays;

public class TaskTwentySixth {
    public static void main(String []args) {
        int[] src = GetArray.getArray();

        System.out.println(Arrays.toString(src));

        System.out.println(Arrays.toString(reverseArray(src)));
    }

    public static int[] reverseArray(int[] src) {
        int[] dist = new int[src.length];
        int srcLen = src.length - 1;
        for (int i = srcLen; i >= 0; i--) {
            dist[srcLen - i] = src[i];
        }

        return dist;
    }
}
