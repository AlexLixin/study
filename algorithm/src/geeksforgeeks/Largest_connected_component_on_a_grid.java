
package geeksforgeeks;


public class Largest_connected_component_on_a_grid {
    static int count = 0;
    static int max = 0;
    static int[][] tmp = new int[6][8];

    public static void main(String[] args) {
        int[][] input = { { 1, 4, 4, 4, 4, 3, 3, 1 }, { 2, 1, 1, 4, 3, 3, 1, 1 }, { 3, 2, 1, 1, 2, 3, 2, 1 }, { 3, 3, 2, 1, 2, 2, 2, 2 }, { 3, 1, 3, 1, 1, 4, 4, 4 }, { 1, 1, 3, 1, 1, 4, 4, 4 } };
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                count = 0;
                tmp = new int[6][8];
                dfs(input, i, j);
                if (max < count)
                    max = count;
            }
        }
        System.out.println(max+1);
    }

    private static void dfs(int[][] input, int row, int column) {
        tmp[row][column] = 1;
        int x, y;

        //up
        x = row - 1;
        y = column;
        if (valid(input, row, column, x, y)) {
            count++;
            dfs(input, x, y);
        }

        //right
        x = row;
        y = column + 1;
        if (valid(input, row, column, x, y)) {
            count++;
            dfs(input, x, y);
        }

        //down
        x = row + 1;
        y = column;
        if (valid(input, row, column, x, y)) {
            count++;
            dfs(input, x, y);
        }

        //left
        x = row;
        y = column - 1;
        if (valid(input, row, column, x, y)) {
            count++;
            dfs(input, x, y);
        }
    }

    static boolean valid(int[][] input, int row, int column, int x, int y) {
        return x >= 0 && x < input.length && y >= 0 && y < input[0].length && input[x][y] == input[row][column] && tmp[x][y] != 1;
    }

}
