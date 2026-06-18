class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]){
                max=piles[i];
            }
        }
        int right=max;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++){
            hours+=(int)Math.ceil((double)piles[i]/mid);
            }
            if(hours<=h){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}