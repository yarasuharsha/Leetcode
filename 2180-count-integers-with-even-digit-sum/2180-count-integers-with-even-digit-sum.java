class Solution {
    public int countEven(int num) {
        int ans=0;
        for(int number=2;number<=num;number++){
            int sum=0;
            int temp=number;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum%2==0){
                ans++;
            }
        }
        return ans;

    }
}