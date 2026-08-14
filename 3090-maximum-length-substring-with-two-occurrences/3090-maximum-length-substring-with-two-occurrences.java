class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            while(map.get(ch)>2){
                char chleft=s.charAt(left);
                map.put(chleft,map.get(chleft)-1);
                left++;

            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}