class Solution {
    public int minimumDeletions(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int minindex=-1;
        int maxindex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
                maxindex=i;
            }
            if(nums[i]<mini){
                mini=nums[i];
                minindex=i;
            }
        }
        int left=Math.min(minindex,maxindex);
        int right=Math.max(minindex,maxindex);

        int option1=left+nums.length-right+1;
        int option2=right+1;
        int option3=nums.length-left;

        return Math.min(option1,Math.min(option2,option3));
    }
}