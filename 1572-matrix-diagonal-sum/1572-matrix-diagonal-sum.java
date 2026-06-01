class Solution {
    public int diagonalSum(int[][] mat) {
        int summ=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    summ+=mat[i][j];
                    summ+=mat[i][mat.length-i-1];
                }
            }
        }
                if(mat.length%2==1){
                    summ-=mat[mat.length/2][mat.length/2];
                }
                
            
        
        return summ;
    }
}