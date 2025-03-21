class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int i=0;
        while(i<=row && col>=0)
        {
            if(matrix[i][col]==target)
            {
                return true;
            }
            else if(matrix[i][col]>target)
            {
                col--;
            }
            else if(matrix[i][col]<target)
            {
                i++;
            }
        }
        return false;
    }
}
