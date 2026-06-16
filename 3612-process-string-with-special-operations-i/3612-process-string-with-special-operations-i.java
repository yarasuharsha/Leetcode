class Solution {
    public String processStr(String s) {
        ArrayList<String> list=new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                list.add(ch+"");
            }
            else if(ch=='#'){
                if(!list.isEmpty()){
                int size=list.size();
                for(int i=0;i<size;i++){
                list.add(list.get(i));
                }
            }
            }
            else if(ch=='*'){
                if(!list.isEmpty()){
                list.remove(list.size()-1);
            }
            }
            else if(ch=='%'){
                Collections.reverse(list);
            }
        }
        return String.join("",list);
    }
}