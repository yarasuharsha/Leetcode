class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=a;
            a=b;
            b=temp+b;
            count++;
        }
        return n==0?a:b;
    }
}