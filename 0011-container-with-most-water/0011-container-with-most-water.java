class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxi=0;
        while(left<right){
          int min_height=Math.min(height[left],height[right]);
            maxi=Math.max(min_height*(right-left),maxi);
            if(min_height==height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}