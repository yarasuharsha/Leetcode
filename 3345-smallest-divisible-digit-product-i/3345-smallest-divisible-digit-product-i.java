class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        while(true){
        int summ=1;
        int temp=num;
        while(temp>0){
            summ*=temp%10;
            temp=temp/10;
        }
        if(summ%t==0){
            return num;
        }
        num++;

        }
       
    }
}