class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> Map=new HashMap<>();
       for(int i: nums){
        if(Map.containsKey(i)){
            Map.put(i,Map.get(i)+1);
        }
        else{
            Map.put(i,1);
        }
       }
       for(int i : nums){
        if(Map.get(i)>=2){
            return i;
        }
       }
       return -1;
    }
}