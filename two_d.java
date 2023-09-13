package array;

import java.util.*;

public class two_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int sumrow;
        int sumcolumn;
        System.out.println("enter values");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            sumrow = 0;
            for (int j = 0; j < a[0].length; j++)
                sumrow = sumrow + a[i][j];

            System.out.println("sum of rows is: " + sumrow);
        }
        for (int i = 0; i < a.length; i++) {
            sumcolumn = 0;
            for (int j = 0; j < a[0].length; j++)
                sumcolumn = sumcolumn + a[j][i];

            System.out.println("sum of columns is: " + sumcolumn);
        }

    }
}
