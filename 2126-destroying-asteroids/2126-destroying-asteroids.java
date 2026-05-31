class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long count=mass;
        for(int i  : asteroids){
            if(i>count){
                return false;
            }
            count+=i;
        }
        return true;

    }
}