import java.util.InputMismatchException;
import java.util.Scanner;

public class GetArray {
    public static int[] getArray() {
        Scanner in = new Scanner(System.in);
        int[] arr = {};

        try {
            System.out.print("Enter length of array: ");
            int len = in.nextInt();
            arr = new int[len];

            System.out.println("Enter elements of array");
            for (int i = 0; i < len;) {
                try {
                    System.out.print("["+i+"] = ");
                    arr[i] = in.nextInt();
                    i++;
                } catch (InputMismatchException er) {
                    System.out.println("Integer expected");
                    in.nextLine();
                }
            }
        } catch (InputMismatchException er) {
            System.out.println("Integer expected");
        } catch (NegativeArraySizeException er) {
            System.out.println("Array size have to be positive number");
        }

        return arr;
    }
}
