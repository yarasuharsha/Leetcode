class Solution {
    public int findLucky(int[] arr) {
        int neww[]=new int[501];
        for(int i : arr){
            neww[i]++;
        }
       
        for(int i=500;i>0;i--){
            if(neww[i]==i){
               return i;
            }
        }
        return -1;
    }
}