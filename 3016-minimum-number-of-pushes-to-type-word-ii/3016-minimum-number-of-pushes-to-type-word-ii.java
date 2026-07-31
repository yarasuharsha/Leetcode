class Solution {
    public int minimumPushes(String word) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char ch : word.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
       }
       ArrayList<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<list.size();i++){
            ans+=((i/8)+1)*list.get(i);
        }
        return ans;
    }
}