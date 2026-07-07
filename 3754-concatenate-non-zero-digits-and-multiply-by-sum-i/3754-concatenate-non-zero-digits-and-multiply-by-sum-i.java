class Solution {
    public long sumAndMultiply(int n) {
        long result=0;
        int place=1;
        while(n>0){
            int temp=n%10;
            if(temp!=0){
                result+=temp*place;
                place*=10;
            }
            n=n/10;
        }
        long ans=0;
        long r=result;
        while(result>0){
            ans=ans+result%10;
            result=result/10;
        }
       return r*ans;
    }
}