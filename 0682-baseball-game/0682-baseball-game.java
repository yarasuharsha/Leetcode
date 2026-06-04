class Solution {
    public int calPoints(String[] operations) {
        ArrayList <Integer> list=new ArrayList<>();
        for(String s : operations){
            if(s.equals("+")){
                int n=list.size();
                list.add(list.get(n-1)+list.get(n-2));
            }
            else if(s.equals("C")){
                list.remove(list.size()-1);           
             }
            else if(s.equals("D")){
                list.add(2*list.get(list.size()-1));
            }
            else{
                int value=Integer.parseInt(s);
                list.add(value);
            }
        }
        int score=0;
        for(int i:list){
            score+=i;
        }
        return score;
    }
}