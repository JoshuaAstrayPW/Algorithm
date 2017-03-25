/**
 * Created by fangxu on 2017/3/25.
 */
public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j])
                    mat[i][j] = 0;


            }
        return mat;
    }
}
