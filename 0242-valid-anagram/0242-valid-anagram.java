class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap <Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(freq.containsKey(ch1)){
                freq.put(ch1,freq.get(ch1)+1);
            }
            else{
                freq.put(ch1,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(!freq.containsKey(ch2)){
                return false;
            }
            else{
                
                freq.put(ch2,freq.get(ch2)-1);
                if(freq.get(ch2)==0){
                    freq.remove(ch2);
                }
            }
        }
       return freq.isEmpty();
        
    }
}