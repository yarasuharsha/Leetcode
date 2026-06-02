class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int landtime=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterDuration.length;j++){
                int waterstarttime=Math.max(landtime,waterStartTime[j]);
                ans=Math.min(ans,waterstarttime+waterDuration[j]);
            }
        }
        for(int i=0;i<waterStartTime.length;i++){
            int watertime=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landDuration.length;j++){
                int landstarttime=Math.max(watertime,landStartTime[j]);
                ans=Math.min(ans,landstarttime+landDuration[j]);
            }
        }
        return ans;
    }
}