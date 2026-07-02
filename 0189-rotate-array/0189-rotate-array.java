class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0){
            return;
        }
        int temp[]=new int[n-k];
        for(int i=0;i<n-k;i++){
            temp[i]=nums[i];
        }
       for(int i=n-k;i<nums.length;i++){
        nums[i-(n-k)]=nums[i];
       }
       for(int i=k;i<nums.length;i++){
        nums[i]=temp[i-k];

       }
    }
}