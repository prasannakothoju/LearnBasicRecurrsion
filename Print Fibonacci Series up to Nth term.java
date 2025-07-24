import java.util.*;
import java.util.Scanner;

public class A {

    //creating a function
    public static int fibonacci(int n) {
        if (n <= 1) {  //if 0 ret 0 viceversa for 1
            return n;
        }

        int first = fibonacci(n - 1);
        int second = fibonacci(n - 2);
        return first + second;
    }

    public static void main(String[] args) {
        int n = 5;

        // Correction: loop to print all terms from 0 to n
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
