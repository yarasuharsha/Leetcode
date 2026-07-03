class Solution {
    public int missingNumber(int[] nums) {
        int xor1=nums.length;
        for(int i=0;i<nums.length;i++){
            xor1=xor1^i;
            xor1=xor1^nums[i];
        }
        return xor1;
    }
}