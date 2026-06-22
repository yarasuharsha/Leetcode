class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : text.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int a=map.getOrDefault('a',0);
        int b=map.getOrDefault('b',0);
        int l=map.getOrDefault('l',0);
        int o=map.getOrDefault('o',0);
        int n=map.getOrDefault('n',0);
        
        return Math.min(Math.min(a,b),Math.min(l/2,Math.min(o/2,n)));

    }
}