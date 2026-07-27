class Solution {
    public int maxProduct(int[] nums) {
        int max1=-1;
        int max2=-1;
        for(int i : nums){
            if(i>max1){
                int temp=max1;
                max1=i;
                max2=temp;
            }
            else if(i>max2){
                max2=i;
            }
        }
        return (max1-1)*(max2-1);
    }
}