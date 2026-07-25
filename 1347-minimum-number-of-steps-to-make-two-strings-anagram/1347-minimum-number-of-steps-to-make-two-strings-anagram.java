class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        char arr[]=s.toCharArray();
        int result=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        char arr2[]=t.toCharArray();
        for(int i=0;i<t.length();i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i],map.get(arr2[i])-1);
            }
           
        }
       
            for(int i : map.values()){
                if(i>0){
                result+=i;
                }
            }
        
        return result;
    }
}