class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=i+1;j<nums.length;j++){
                rightsum+=nums[j];
            }
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            arr[i]=Math.abs(leftsum-rightsum);
        }
        return arr;
    }
}