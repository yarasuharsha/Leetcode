class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        for(int i=0;i<num.length();i+=2){
            char ch=num.charAt(i);
            int integer=Integer.parseInt(ch+"");
            even+=integer;
        }
        for(int i=1;i<num.length();i+=2){
            char ch=num.charAt(i);
            int integer=Integer.parseInt(ch+"");
            odd+=integer;
        }
        if(odd==even){
            return true;
        }
        return false;
        

    }
}