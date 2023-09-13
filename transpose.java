package array;

public class transpose {
    public static void main(String[] args) {
        int r, c;
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        r = a.length;
        c = a[0].length;
        int t[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                t[i][j] = a[j][i];
            }

        }
        System.out.println("transpose matrix");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.println(t[i][j] + " ");
            }
            System.out.println();

        }

    }

}
