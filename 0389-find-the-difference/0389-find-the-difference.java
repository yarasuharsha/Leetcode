class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(freq.containsKey(ch1)){
                freq.put(ch1,freq.get(ch1)+1);
            }
            else{
                freq.put(ch1,1);
            }
        }
        for(int i=0;i<=t.length()-1;i++){
            char ch2=t.charAt(i);
            if(!freq.containsKey(ch2) || freq.get(ch2)==0){
                return ch2;
            }
            freq.put(ch2,freq.get(ch2)-1);
        }
        return ' ';


    }
}