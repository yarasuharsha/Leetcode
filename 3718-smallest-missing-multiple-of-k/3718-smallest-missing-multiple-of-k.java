class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]%k==0){
            set.add(nums[i]);
        }
       }
       int multi=1;
       while(true){
        if(set.contains(k*multi)){
            multi++;
        }
        else{
            return k*multi;
        }
       }
    }
}