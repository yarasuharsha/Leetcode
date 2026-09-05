class Solution {
    public boolean canJump(int[] nums) {
        int maxind=0;
        int i=0;
        while(maxind<nums.length && i<nums.length){
            if(maxind<i){
                return false;
            }
            maxind=Math.max(maxind,i+nums[i]);
            i++;
        }
        return true;
       
    }
}