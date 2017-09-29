/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_2_calendar;

/**
 *
 * @author Isra
 */
public class TimeI { 
    private int day;
    private Month month;
    private int year;
    private boolean leap;
    private int acc;
    private final Month invalid_month;

    public TimeI() {
        invalid_month=new Month("Not",-1);
        this.day=-1;
        this.month=invalid_month;
        this.year=-1;
    }
    
    public void setInvalid() {
        this.day=-1;
        this.month=invalid_month;
        this.year=-1;
    }
    
    public TimeI(int day, Month month, int year) {
        invalid_month=new Month("Not",-1);
        this.day = day;
        this.month = month;
        this.year = year;
        this.leap=CalendarI.leapYear(this.year);
    }
    
    public int daysToNewYear(){
        int days_to=daysToDate(new TimeI(31,RulesI.Months[11],this.year));
        return days_to+1;
    }
    
    public int daysToDate(TimeI date){
        if (this.leap)
            RulesI.Months[1].setDaysCount(29);
        
        if (this.month.getName().equals(date.getMonth().getName()))
            return Math.abs(Math.subtractExact(this.day, date.getDay()));
        
        acc=Math.abs(Math.subtractExact(this.day, this.month.getDaysCount()))+date.getDay();
        for (int i = RulesI.indexOf(this.month)+1; i < RulesI.indexOf(date.getMonth()); i++) {
            acc+=RulesI.Months[i].getDaysCount();
        }
        
        if (this.leap)
            RulesI.Months[1].setDaysCount(28);
        
        return acc;
    }
    
    public boolean isLeap(){
        return this.leap;
    }
    
    public boolean checkLeap(){
        return !(this.month.getName().equals("Feb") && this.day==29 && !this.leap);
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        this.leap=CalendarI.leapYear(this.year);
    }
    
}
