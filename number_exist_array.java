package array;

import java.util.Scanner;

public class number_exist_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter values: ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.println("Input number to check");
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("number is exist");
                break;
            } else {
                System.out.println("number is not exist");
            }
        }
    }

}
