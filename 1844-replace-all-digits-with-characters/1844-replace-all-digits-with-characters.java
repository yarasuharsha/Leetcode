class Solution {
    public String replaceDigits(String s) {
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(arr[i])){
                int temp=arr[i-1]+(arr[i]-'0');
                arr[i]=(char) temp;
            }
        }
        return new String(arr);
    }
}