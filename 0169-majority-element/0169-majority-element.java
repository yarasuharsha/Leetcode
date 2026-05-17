class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
            if(freq.get(nums[i])>nums.length/2){
                return nums[i];
            }
            
            
        }
        return -1;
        
        
    }
}