class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     List<Integer> nums=new ArrayList<>();
     int i=0;
     for(String s:words){
        if(s.contains(x+"")){
            nums.add(i);
            
        }
        i++;
        
     }   
     return nums;
    }
}