class Solution {
    public int strStr(String haystack, String needle) {
        int nl=needle.length();
        int hl=haystack.length();
        for(int i=0;i<=hl-nl;i++){
            String sub=haystack.substring(i,i+nl);
            if(needle.equals(sub)){
                return i;
            }
        }
        return -1;
    }
}