package array;

import java.util.Scanner;

public class negative_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        System.out.println("enter values: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < a.length; i++)
            if (a[i] < 0) {
                count++;
            }
        System.out.println(" negative number are: " + count);
    }

}
