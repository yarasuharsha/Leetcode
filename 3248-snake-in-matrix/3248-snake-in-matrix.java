class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        for (int j=0;j<commands.size();j++){
            String s=commands.get(j);
            if(s.equals("RIGHT")){
                i+=1;
            }
            else if(s.equals("LEFT")){
                i-=1;
            }
            else if(s.equals("UP")){
                i-=n;
            }
            else{
                i+=n;
            }
            
            
        }
        return i;
    }
}