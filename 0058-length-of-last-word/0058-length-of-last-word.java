class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char arr[]=s.toCharArray();
        int right=arr.length-1;
        while(right>=0 && arr[right]!=' '){
            right--;
        }
        return arr.length-1-right;
    }
}