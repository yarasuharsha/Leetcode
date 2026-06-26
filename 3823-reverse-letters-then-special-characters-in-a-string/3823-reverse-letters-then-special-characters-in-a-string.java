class Solution {
    public String reverseByType(String s) {
        char arr[]=s.toCharArray();
       int left=0;
       int right=s.length()-1;
       while(left<right){
        if(!Character.isLetter(arr[left])){
            left++;
        }
         else if(!Character.isLetter(arr[right])){
            right--;
        }
        else{
       char temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
       left++;
       right--;
        }
       }

       int lef=0;
       int righ=arr.length-1;
       while(lef<righ){
        if(Character.isLetter(arr[lef])){
            lef++;
        }
        else if(Character.isLetter(arr[righ])){
            righ--;
        }
        else{
        char tem=arr[righ];
        arr[righ]=arr[lef];
        arr[lef]=tem;
        lef++;
        righ--;
       }
       }
       return new String(arr);
        
    }
}