package array;

import java.util.*;

public class major_minor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter values ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                a[i][j] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.println("major diagonals: " + a[i][j] + " ");

                }
            }
        }
        System.out.println("  ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((i + j) == (a.length - 1)) {
                    System.out.println("minor diagonals: " + a[i][j] + " ");

                }
            }
        }
        System.out.println("  ");

    }

}
