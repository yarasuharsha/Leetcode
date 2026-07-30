class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }
        else if(word.length()>8 && word.length()<17){
            return 8+(word.length()-8)*2;
        }
        else if(word.length()>16 && word.length()<25){
            //8+2*8
            return 24+(word.length()-16)*3;
        }
        else{
            // return (8+2*8+3*8)+(word.length()-24)
            return 48+(word.length()-24)*4;
        }

    }
}