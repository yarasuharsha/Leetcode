class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String arrdays[]={"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
        int total=day;
         for(int i=1971;i<year;i++){
            total+=leapyear(i);
        }
        for(int i=1;i<month;i++){
            if(i%2==1 && i!=2 && i<=7){
            total+=31;
            }
            else if(i%2==0 && i!=2 && i<=7){
                total+=30;
            }
            else if(i%2==0 && i>7){
                total+=31;
            }
            else if(i%2!=0 && i>7){
                total+=30;
            }
            else if(i==2){
                total+=leapyearfeb(year);
            }

        }
       
        return arrdays[(total-1)%7];

    }
    public static int leapyearfeb(int year){
        if((year%4==0 && year%100!=0) || year%400==0){
            return 29;
        }
        else{
            return 28;
        }
    }
    public static int leapyear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return 366;
        }
        else{
            return 365;
        }
    }
}