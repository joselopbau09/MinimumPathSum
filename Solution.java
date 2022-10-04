
class Solution {
    public static int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) { 
            return 0;
        }
        int m =  grid.length;
        int n = grid[0].length;
        for (int i = m - 1; i >= 0; i-- ) {
            for(int j = n - 1; j >= 0; j-- ) {
                if(i == m - 1 && j == n - 1) {
                    continue;
                }   
                else if(i == m - 1 && j!= n - 1) {
                    grid[i][j] = grid[i][j] + grid[i][j+1];
                    continue;
                }
                else if(j == n - 1 && i!= m - 1) {
                    grid[i][j] = grid[i][j] + grid[i+1][j];
                    continue;
                }
                else    
                    grid[i][j] = grid[i][j] + Math.min(grid[i+1][j], grid[i][j+1]);
             } 
        }
        return grid[0][0];
    }   

    public static void main(String[] args) {
        int[][] ejemplo1 = {{1,3,1}, {1,5,1}, {4,2,1}};
        int[][] ejemplo2 = {{1,2,3},{4,5,6}};

        System.out.println("Ejemplos 1:");
        System.out.println(minPathSum(ejemplo1));
        System.out.println("Ejemplos 2:");
        System.out.println(minPathSum(ejemplo2));
    }
}