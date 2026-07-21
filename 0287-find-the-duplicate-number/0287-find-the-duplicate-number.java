class Solution {
    public int findDuplicate(int[] nums) {
       int arr[]=new int[nums.length];
       for(int i=0;i<arr.length;i++){
        arr[i]=0;
       }
       for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
       }
       for(int i=0;i<nums.length;i++){
        if(arr[i]>=2){
            return i;
        }
       }
       return -1;
    }
}