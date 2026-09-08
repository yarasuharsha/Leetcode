class Solution {
    public int countCommas(int n) {
        int count=0;
        int i=1000;
        while(i<=n && i<=100000){
            count++;
            i++;
        }
        return count;
    }
}