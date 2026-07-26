class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i : nums){
            if(i>=max1){
                int temp1=max1;
                int temp2=max2;
                max1=i;
                max2=temp1;
                max3=temp2;
            }
            else if(i>=max2 && i<=max1){
                int temp1=max2;
                max2=i;
                max3=temp1;
            }
            else if(i<=max2 && i>=max3 ){
                max3=i;
            }
            if(i<=min1){
                int temp=min1;
                min1=i;
                min2=temp;
            }
            else if(i>=min1 && i<=min2){
                min2=i;
            }
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}