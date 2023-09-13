package array;

public class sparsh {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 0 },
                { 0, 3, 1 },
                { 4, 1, 1 }
        };
        int r = 3, c = 3;
        int count = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] == 0)
                    ++count;
        if (count > ((r * c) / 2))
            System.out.println("it is a sparsh matrix");
        else
            System.out.println("it is not a sparsh matrix");
    }

}
