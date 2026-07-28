class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        char ans[]=new char[s.length()];
        char arrstr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                ans[s.length()/2]=(char)(i+'a');
                arr[i]--;
            }
        }
        int left=0;
        int right=arrstr.length-1;
        for(int i=0;i<26;i++){
           while(arr[i]>=2){
            ans[left]=(char)(i+'a');
            ans[right]=(char)(i+'a');
            left++;
            right--;
            arr[i]-=2;
           }

        }
        
        return new String(ans);

    }
}