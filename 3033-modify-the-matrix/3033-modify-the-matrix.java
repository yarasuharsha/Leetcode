class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=maximum(matrix,j);
                }
            }
        }
        return matrix;

    }
    public static int maximum(int[][] matrix,int j){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
           max=Math.max(max,matrix[i][j]);
            
        }
        return max;
    }
    
}