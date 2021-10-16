import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwentySecond {
    public static void main(String[] args) {
        int[] src = GetArray.getArray();

        System.out.println("--> Array:");
        System.out.println(Arrays.toString(src));

        System.out.println("--> Indexes of elements, which was sorted in descending order:");
        System.out.println(Arrays.toString(indexesDescending(src)));
    }

    public static int[] indexesDescending(int[] src) {
        int[] indexes = new int[src.length];
        List<Integer> srcList = arrayToList(src);

        int[] srcSorted = src.clone();
        Arrays.sort(srcSorted); // sort array in asc
        srcSorted = TaskTwentySixth.reverseArray(srcSorted); // reverse to desc

        for (int i = 0; i < src.length; i++) {
            indexes[i] = srcList.indexOf(srcSorted[i]);
        }

        return indexes;
    }

    private static List<Integer> arrayToList(int[] src) {
        List<Integer> list = new ArrayList<>();

        for (int elem : src) {
            list.add(elem);
        }

        return list;
    }
}
