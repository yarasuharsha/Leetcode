class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxx=0;
        for(int i=0;i<accounts.length;i++){
            int summ=0;
            for(int j=0;j<accounts[0].length;j++){
               summ=summ+accounts[i][j];
            }
             maxx=Math.max(maxx,summ);
        }
        return maxx;
    }
}