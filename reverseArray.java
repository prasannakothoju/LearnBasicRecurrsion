import java.util.*;

public class A {

    // Recursive method to reverse the array
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int[] arr = new int[list.size()];

        // Convert list to array
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
