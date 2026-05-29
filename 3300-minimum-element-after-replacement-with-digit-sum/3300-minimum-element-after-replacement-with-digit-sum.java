class Solution {
    public int minElement(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            int summ=0;
            while(nums[i]>0){
                summ+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            nums[k]=summ;
            k++;
        }
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}