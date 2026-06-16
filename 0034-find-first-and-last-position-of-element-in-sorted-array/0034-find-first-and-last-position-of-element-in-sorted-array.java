class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int []{firstocc(nums,target),lastocc(nums,target)};
    }
        public int firstocc(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ind=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target){
                right=mid-1;
                ind=mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ind;
        }
        public int lastocc(int[]nums,int target){
            int left=0;
            int right=nums.length-1;
            int ind2=-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]==target){
                    left=mid+1;
                    ind2=mid;
                }
                else if(nums[mid]<target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            return ind2;
        }
      
}