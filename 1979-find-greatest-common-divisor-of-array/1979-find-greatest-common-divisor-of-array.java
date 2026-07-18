class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i : nums){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        return gcd(max,min);
    }
    public static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
}