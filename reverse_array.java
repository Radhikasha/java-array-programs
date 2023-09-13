package array;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter values: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.println("in reverse order");
        for (int i = a.length - 1; i >= 0; i--)

            System.out.println(a[i]);
    }

}
