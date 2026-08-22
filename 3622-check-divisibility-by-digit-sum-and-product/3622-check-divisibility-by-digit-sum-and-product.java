class Solution {
    public boolean checkDivisibility(int n) {
        int product=1;
        int sum=0;
        int original=n;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n=n/10;
        }
        if(original%(sum+product)!=0){
            return false;
        }
        return true;
    }
}