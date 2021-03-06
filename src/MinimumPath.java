/**
 * Created by fangxu on 2017/5/10.
 * 有一个矩阵map，它每个格子有一个权值。从左上角的格子开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。
 * <p>
 * 给定一个矩阵map及它的行数n和列数m，请返回最小路径和。保证行列数均小于等于100.
 * <p>
 * 测试样例：
 * [[1,2,3],[1,1,1]],2,3
 * 返回：4
 */
public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        int[][] path = new int[n][m];
        path[0][0] = map[0][0];
        for (int i = 1; i < m; i++)
            path[0][i] = path[0][i - 1] + map[0][i];
        for (int i = 1; i < n; i++)
            path[i][0] = path[i - 1][0] + map[i][0];
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                path[i][j] = map[i][j] + Math.min(path[i - 1][j], path[i][j - 1]);
        return path[n - 1][m - 1];
    }
}