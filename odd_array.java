package array;

import java.util.*;

public class odd_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("enter values: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                sum = sum + a[i];
            }

        }
        System.out.println("odd numbers are: " + sum);

    }

}
