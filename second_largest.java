package array;

import java.util.*;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int second = 0;
        System.out.println("enter values: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    second = a[i];
                    a[i] = a[j];
                    a[j] = second;
                }

            }

        }
        System.out.println("second largest number is: " + a[a.length - 2]);

    }

}
