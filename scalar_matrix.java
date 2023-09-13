package array;

import java.util.*;

public class scalar_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column size");
        int r = sc.nextInt();

        int a[][] = new int[r][r];
        System.out.println("enter values");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < r; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < r; j++)
                if ((i != j) && (a[i][j] != 0))
                    System.out.println("it is not scalar");

                else
                    System.out.println("it is scalar");

    }

}
