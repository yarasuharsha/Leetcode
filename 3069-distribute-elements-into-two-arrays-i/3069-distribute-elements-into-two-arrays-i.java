class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[nums.length];
        int nums2[]=new int[nums.length];
        int a=0;
        int b=0;
        nums1[a++]=nums[0];
        nums2[b++]=nums[1];
        
        for(int i=2;i<nums.length;i++){
            if(nums1[a-1]>nums2[b-1]){
                nums1[a++]=nums[i];
            }
            else{
                nums2[b++]=nums[i];
            }
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<a;i++){
            arr[i]=nums1[i];
        }
        for(int i=a;i<nums.length;i++){
            arr[i]=nums2[i-a];
        }
        return arr;

    }
}