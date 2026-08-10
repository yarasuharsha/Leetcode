class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String strr="";
        for(String word : words){
            strr+=word.charAt(0);
        }
        return strr.equals(s)? true:false;
    }
}