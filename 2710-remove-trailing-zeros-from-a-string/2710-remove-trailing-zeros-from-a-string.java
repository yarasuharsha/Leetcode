class Solution {
    public String removeTrailingZeros(String num) {
       int right=num.length()-1;
        while(right>=0){
            if(num.charAt(right)!='0'){
                return num.substring(0,right+1);
            }
            right--;
        }
        return "";
    }
}