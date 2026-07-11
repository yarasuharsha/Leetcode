class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for(int i=num.length()-1;i>=0;i--){
            int n=Integer.parseInt(num.charAt(i)+"");
            if(n%2==1){
                index=i;
                break;
            }
        }
       return num.substring(0,index+1);
    }
}