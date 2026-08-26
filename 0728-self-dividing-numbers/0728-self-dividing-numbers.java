class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=right){
            int n=left;
            int count=0;
            int num_len=0;
            while(n>0){
                int rem=n%10;
                if(rem!=0){
                    if(left%rem==0){
                    count++;
                    }
                }
                num_len++;
                n=n/10;
            }
                if(count==num_len){
                    list.add(left);
                
            }
            left++;
        }
        return list;
    }
}