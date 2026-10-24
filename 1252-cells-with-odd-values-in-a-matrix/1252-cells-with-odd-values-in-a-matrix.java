class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[]op : indices){
            int row = op[0];
            int col = op[1];

            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;

    }
}