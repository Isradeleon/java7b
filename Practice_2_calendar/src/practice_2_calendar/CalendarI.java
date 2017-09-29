/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2_calendar;

import java.util.ArrayList;

/**
 *
 * @author Isra
 */
public class CalendarI {
    private static final TimeI startDate=new TimeI(1,RulesI.Months[0],1900);
    private static TimeI minDate;
    private static TimeI maxDate;
    private static int acc= 0;
    
    public static boolean leapYear(int year){
        return (year % 100 != 0 && year % 4 == 0 || year % 100 == 0 && year % 400 == 0 && year % 4 == 0);
    }
    
    public static boolean leapYear(TimeI time){
        int year = time.getYear();
        return (year % 100 != 0 && year % 4 == 0 || year % 100 == 0 && year % 400 == 0 && year % 4 == 0);
    }
    
    public static int datesDaysDifference(TimeI date1, TimeI date2){
        if (date1.getYear()>date2.getYear()) {
            minDate=date2;
            maxDate=date1;
        }else if(date1.getYear()<date2.getYear()){
            minDate=date1;
            maxDate=date2;
        }else if(RulesI.indexOf(date1.getMonth())>RulesI.indexOf(date2.getMonth())){
            minDate=date2;
            maxDate=date1;
        }else if(RulesI.indexOf(date1.getMonth())<RulesI.indexOf(date2.getMonth())){
            minDate=date1;
            maxDate=date2;
        }else if(date1.getDay()>date2.getDay()){
            minDate=date2;
            maxDate=date1;
        }else if(date1.getDay()<date2.getDay()){
            minDate=date1;
            maxDate=date2;
        }else{
            return 0;
        }
        
        int dif_years=Math.subtractExact(maxDate.getYear(),minDate.getYear());
        if (dif_years != 0) {
            acc=minDate.daysToNewYear();
            startDate.setYear(maxDate.getYear());
            //System.out.println("Acc first:"+String.valueOf(acc));
            acc+=startDate.daysToDate(maxDate);
            //System.out.println("Acc after:"+String.valueOf(acc));
            acc+=yearsSum(minDate.getYear(),maxDate.getYear());
            return acc;
        }
        return minDate.daysToDate(maxDate);
    }
    
    private static int yearsSum(int minYear, int maxYear){
        int accumulator=0;
        for (int i = minYear+1; i < maxYear; i++) {
            accumulator+=365;
            if (leapYear(i))
                accumulator++;    
        }
        return accumulator;
    }
    
    public static ArrayList<Integer> leapYearsTotal(int minYear, int maxYear){
        ArrayList<Integer> leap_years=new ArrayList();
        for (int i = minYear; i <= maxYear; i++) {
            if (leapYear(i)) {
                leap_years.add(i);
            }
        }
        return leap_years;
    }
}
