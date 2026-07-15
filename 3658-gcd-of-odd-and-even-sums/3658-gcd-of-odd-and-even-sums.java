class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==1){
                sumodd+=i;
            }
            else{
                sumeven+=i;
            }
        }
        return gcd(sumodd,sumeven);

    }
    public static int gcd(int sumodd,int sumeven){
        while(sumodd>0 && sumeven>0){
            if(sumodd>sumeven){
                sumodd=sumodd%sumeven;
            }
            else{
                sumeven=sumeven%sumodd;
            }
        }
            if(sumodd==0){
                return sumeven;
            }
            else if(sumeven==0){
                return sumodd;
            }

        
        return 1;
    }
}