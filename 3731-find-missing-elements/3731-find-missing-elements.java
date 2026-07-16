class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            set.add(i);
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=min+1;j<max;j++){
        if(!set.contains(j)){
            list.add(j);
        }
        }
        return list;
    }
}