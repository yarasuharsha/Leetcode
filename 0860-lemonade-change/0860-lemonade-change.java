class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[]=new int[3];
        for(int i=0;i<bills.length;i++){
            
            if(bills[i]==5){
                arr[0]++;
            }
            else if(bills[i]==10){
                arr[1]++;
                arr[0]--;
            }
            else{
                if(arr[0]>=1 && arr[1]>=1){
                arr[2]++;
                arr[1]--;
                arr[0]--;
                }
                else{
                    arr[0]-=3;
                }
            }
            for(int j : arr){
            if(j<0){
                return false;
            }
        }
        }
        
        return true;
    }
}