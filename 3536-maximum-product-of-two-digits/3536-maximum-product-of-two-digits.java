class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int result=(arr[s.length()-1]-'0')* (arr[s.length()-2]-'0');
        return result;
    }
}