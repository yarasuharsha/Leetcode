import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch2=ransomNote.charAt(i);
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
            
                return true;
            
        }
    
}
