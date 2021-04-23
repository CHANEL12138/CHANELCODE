import java.util.Scanner;

public class PaintCalender {
    final static int START_DAY_FOR_JAN_1_1800 = 3;
    public static void main(String[] args)
    {
        int year;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the year of the Calender:");
        year = input.nextInt();
        System.out.print("Please input the month of the Calender:");
        month = input.nextInt();
        Print(year,month);
    }
    public static void Print(int year,int month)
    {
        int StartDay=GetStartDay(year,month);
        int MonthDay=GetMonthDay(year, month);
        System.out.println("         "+GetWhichMonth(month)+" "+
                year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tur Wed Thu Fri Sun");
        for(int i=0;i<StartDay;i++)
        {
            System.out.print("  ");
        }
        for(int i=1;i<MonthDay;i++)
        {
            System.out.printf("%4d",i);
            if((i+StartDay)%7==0)
            {
                System.out.println();
            }
        }




    }
    public static String GetWhichMonth(int month)
    {
        String M = "";
        switch (month) {
            case 1 :
                M= "January";break;
            case 2:
                M = "February";break;
            case 3:
                M = "March";break;
            case 4:
                M = "April";break;
            case 5:
                M = "May";break;
            case 6:
                M = "June";break;
            case 7:
                M = "July";break;
            case 8:
                M = "August";break;
            case 9:
                M = "September";break;
            case 10:
                M = "October";break;
            case 11:
                M = "November";break;
            case 12:
                M = "December";break;
        }
        return M;
    }
    public static int GetStartDay(int year,int month)
    {
        int total=GetTotalDays(year, month)+START_DAY_FOR_JAN_1_1800;
        return total % 7 ;
    }
    public static int GetMonthDay(int year,int month)
    {
        if(month==1||month==3||month==5||month==7||
                month==8||month==10||month==12)
            return 31;
        else if(IsLeapYear(year)&&month==2)
            return 29;
        else if((!IsLeapYear(year))&&month==2)return 28;
        else return 30;
    }
    public static int GetTotalDays(int year,int month)
    {
        int total=0;
        for(int i=1800;i<year;i++)
        {
            if(IsLeapYear(year))
                total+=366;
            else
                total+=365;
        }
        for(int i=1;i<month;i++)
        {
            total+=GetMonthDay(year,i);
        }
        return total;
    }
    public static boolean IsLeapYear(int year)
    {
        if(year%400==0||(year%4==0&&year%100!=0))
            return true;
        else return false;
    }


}
