class Solution {
    public void setZeroes(int[][] matrix) {
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int row[]=new int[rowlen];
        int col[]=new int [collen];
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
            
        }
    }
}