class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int total=day;
        int monthends[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapyear(year) && month>2){
                total++;
            }
        for(int i=1;i<month;i++){
            total+=monthends[i-1];
            
        }
        for(int i=1971;i<year;i++){
            if(leapyear(i)){
                total+=366;
            }
            else{
                total+=365;
            }
        }
        int ans=(total-1)%7;

        switch(ans){
            case 0:
                return "Friday";
               
            case 1:
                return "Saturday";
            case 2:
                return "Sunday";
                
            case 3:
                return "Monday";
               
            case 4:
                return "Tuesday";
               
            case 5:
                return "Wednesday";
                
            case 6:
                return "Thursday";
                
            default:
                return "";
        }
     


    }
    public static boolean leapyear(int year){
        if((year%4==0 && year%100!=0)||year%400==0){
            return true;
        }
        else{
            return false;
        }
    }
}